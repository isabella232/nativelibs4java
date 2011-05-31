package org.bridj.cpp.com;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Runtime;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Runtime(CRuntime.class) 
public class RECT extends StructObject {
	public RECT() {
		super();
	}
	public RECT(Pointer pointer) {
		super(pointer);
	}
	@CLong 
	@Field(0) 
	public long left() {
		return this.io.getCLongField(this, 0);
	}
	@CLong 
	@Field(0) 
	public RECT left(long left) {
		this.io.setCLongField(this, 0, left);
		return this;
	}
	public final long left_$eq(long left) {
		left(left);
		return left;
	}
	@CLong 
	@Field(1) 
	public long top() {
		return this.io.getCLongField(this, 1);
	}
	@CLong 
	@Field(1) 
	public RECT top(long top) {
		this.io.setCLongField(this, 1, top);
		return this;
	}
	public final long top_$eq(long top) {
		top(top);
		return top;
	}
	@CLong 
	@Field(2) 
	public long right() {
		return this.io.getCLongField(this, 2);
	}
	@CLong 
	@Field(2) 
	public RECT right(long right) {
		this.io.setCLongField(this, 2, right);
		return this;
	}
	public final long right_$eq(long right) {
		right(right);
		return right;
	}
	@CLong 
	@Field(3) 
	public long bottom() {
		return this.io.getCLongField(this, 3);
	}
	@CLong 
	@Field(3) 
	public RECT bottom(long bottom) {
		this.io.setCLongField(this, 3, bottom);
		return this;
	}
	public final long bottom_$eq(long bottom) {
		bottom(bottom);
		return bottom;
	}
}

