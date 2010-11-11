/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scalacl

import org.junit._
import Assert._

class PerformanceTest extends TestUtils {

  @Test def simpleRangeFilter = testFilter(rng)
  @Test def simpleRangeForeach = testForeach(rng)
  @Test def simpleRangeMap = testMap(rng)

  @Test def simpleMatrixTest = ensureFasterCodeWithSameResult("""
    val a = Array.tabulate[Double](n, n)(_ + _)
    val b = Array.tabulate[Double](n, n)(_ + _)
    var bigTot = 0.0
    val o = Array.tabulate(n, n)((i, j) => {
      var tot = 0.0
      for (k <- 0 until n)
        tot += a(i)(k) * b(k)(j)

      bigTot += tot
      tot
    })
    bigTot + o.size
    //(0 until n).map(k => a(i)(k) * b(k)(j)).sum
  """, 2f, Seq(100))

  val arr = ("Array", "Array.tabulate(n)(i => i)")
  val lis = ("List", "(0 to n).toList")
  val rng = ("Range", "(0 to n)")

  @Test def simpleArrayFilter = testFilter(arr)
  @Test def simpleListFilter = testFilter(lis)
  
  def testFilter(colNameAndExpr: (String, String), f: Float = 1.1f) =
    // name = "Simple " + colNameAndExpr._1  + " Filter",
    ensureFasterCodeWithSameResult(colNameAndExpr._2 + ".filter(x => (x % 2) != 0).size", f)

  @Test def simpleArrayForeach = testForeach(arr)
  @Test def simpleListForeach = testForeach(lis)

  def testForeach(colNameAndExpr: (String, String), f: Float = 1.1f) =
    ensureFasterCodeWithSameResult("""var tot = 0L; for (v <- """ + colNameAndExpr._2 + ") { tot += v }; tot", f)

  @Test def simpleArrayMap = testMap(arr)
  @Test def simpleListMap = testMap(lis)

  def testMap(colNameAndExpr: (String, String), f: Float = 1.1f) =
    ensureFasterCodeWithSameResult(colNameAndExpr._2 + ".map(_ + 1).toSeq", f)

}
