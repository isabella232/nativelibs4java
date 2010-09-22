/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scalacl
import com.nativelibs4java.opencl._

import org.bridj.Pointer
import org.bridj.Pointer._
import org.bridj.SizeT

class CLArray[T](
  val buffers: Array[CLGuardedBuffer[Any]]
)(
  implicit val context: ScalaCLContext,
  dataIO: CLDataIO[T]
)
extends CLCol[T]
   with CLUpdatableCol[T]
{
  type ThisCol[T] = CLArray[T]
  lazy val buffersList = buffers.toList

  implicit val t = dataIO.t
  //def args = Seq(buffer.buffer)

  val elementClasses = buffers.map(_.elementClass)//t.erasure.asInstanceOf[Class[T]]
  
  def apply(index: Long): CLFuture[T] = dataIO.extract(buffers, index)
  override def toArray = dataIO.toArray(buffers)

  override def sizeFuture = new CLInstantFuture(buffers(0).size)
  override def toCLArray = this
  
  private val localSizes = Array(1)

  override def update(f: T => T)(implicit dataIO: CLDataIO[T]): CLArray[T] =
    doMap(f, this)

  override def map[V](f: T => V)(implicit dataIO: CLDataIO[T], vIO: CLDataIO[V]): CLArray[V] = {
    val out = CLArray[V](size)
    implicit val t = out.t
    doMap(f, out)
  }
          
  protected def doMap[V](f: T => V, out: CLArray[V])(implicit dataIO: CLDataIO[T], vIO: CLDataIO[V]): CLArray[V] = {
    println("map should not be called directly, you haven't run the compiler plugin or it failed")
    println("mapping " + dataIO + " to " + vIO)
    readBlock {
      val ptrs = buffers.map(_.toPointer)
      val newPtrs = if (dataIO.t.erasure.equals(vIO.t.erasure))
        ptrs
      else
        buffers.map(b => allocateArray(b.t.erasure.asInstanceOf[Class[Any]], size).order(context.order))
      
      var i = 0L
      while (i < size) {
        val x = dataIO.extract(ptrs, i)
        val y = f(x)
        vIO.store(y, newPtrs, i)
        i += 1
      }
      out.buffers.zip(newPtrs).foreach { case (buffer, newPtr) =>
        buffer.write(evts => {
          assert(evts.forall(_ == null))
          buffer.buffer.asInstanceOf[CLBuffer[Any]].write(context.queue, newPtr.asInstanceOf[Pointer[Any]], false)
        })
      }
    }
    out
  }
  override def updateFun(f: CLFunction[T, T])(implicit dataIO: CLDataIO[T]): CLArray[T] = {
    if (f.isOnlyInScalaSpace)
      update(f.function)
    else {
      doMap(f, this)
      this
    }
  }
  override def mapFun[V](f: CLFunction[T, V])(implicit dataIO: CLDataIO[T], vIO: CLDataIO[V]): CLArray[V] = {
    println("mapping " + dataIO + " to " + vIO)
    if (f.isOnlyInScalaSpace)
      map(f.function)
    else {
      val out = CLArray[V](size)
      doMap(f, out)
      out
    }
  }

  protected def doMap[V](f: CLFunction[T, V], out: CLArray[V]) = {
    val kernel = f.getKernel(context, this, out, "array")
    assert(size <= Int.MaxValue)
    val globalSizes = Array(size.asInstanceOf[Int])
    kernel.synchronized {
      kernel.setArgs((Seq(new SizeT(size)) ++ buffers.map(_.buffer) ++ out.buffers.map(_.buffer)):_*)
      // TODO cut size bigger than int into global and local sizes
      syncAll(buffersList)(out.buffersList)(evts => {
        kernel.enqueueNDRange(context.queue, globalSizes, localSizes, evts:_*)
      })
    }
    out
  }


  override def filter(f: T => Boolean)(implicit dataIO: CLDataIO[T]): CLFilteredArray[T] = {
    println("filter should not be called directly, you haven't run the compiler plugin or it failed")
    val out = new CLFilteredArray[T](buffers)
    readBlock {
      val ptrs = buffers.map(_.toPointer)
      val newPtr = allocateBooleans(size).order(context.order)

      var i = 0L
      while (i < size) {
        val x = dataIO.extract(ptrs, i)
        val b = f(x)
        newPtr.set(i, b)
        i += 1
      }
      out.presence.write(evts => {
        assert(evts.forall(_ == null))
        out.presence.buffer.write(context.queue, newPtr.asInstanceOf[Pointer[Boolean]], false)
      })
    }
    out
  }
  override def filterFun(f: CLFunction[T, Boolean])(implicit dataIO: CLDataIO[T]): CLFilteredArray[T] = {
    if (f.isOnlyInScalaSpace)
      filter(f.function)
    else {
      val out = new CLFilteredArray[T](buffers)
      val kernel = f.getKernel(context, this, out, "array")
      assert(size <= Int.MaxValue)
      val globalSizes = Array(size.asInstanceOf[Int])
      kernel.synchronized {

        kernel.setArgs((Seq(new SizeT(size)) ++ buffers.map(_.buffer) ++ Seq(out.presence.buffer)):_*)
        // TODO cut size bigger than int into global and local sizes
        syncAll(buffersList)(List(out.presence.asInstanceOf[CLGuardedBuffer[Any]]))(evts => {
          kernel.enqueueNDRange(context.queue, globalSizes, localSizes, evts:_*)
        })
      }
      out
    }
  }

  override def slice(from: Long, to: Long) = new CLArray(buffers.map(_.clone(from, to)))
  override def take(n: Long) = new CLArray(buffers.map(_.clone(0, n)))
  override def drop(n: Long) = new CLArray(buffers.map(_.clone(n, size)))

  override def view: CLView[T, ThisCol[T]] = new CLArrayView[T, T, CLArray[T]](this, 0, size, null, null, null, null)
}