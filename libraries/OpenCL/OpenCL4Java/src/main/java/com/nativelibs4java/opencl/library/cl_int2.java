package com.nativelibs4java.opencl.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_int2 extends com.ochafik.lang.jnaerator.runtime.Union<cl_int2, cl_int2.ByValue, cl_int2.ByReference> {
	/// C type : cl_int[2]
	public int[] i32 = new int[(2)];
	public cl_int2() {
		super();
	}
	/// @param i32 C type : cl_int[2]
	public cl_int2(int i32[]) {
		super();
		if (i32.length != this.i32.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.i32 = i32;
		setType(int[].class);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_int2 newInstance() { return new cl_int2(); }
	public static cl_int2[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Union.newArray(cl_int2.class, arrayLength);
	}
	public static class ByReference extends cl_int2 implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends cl_int2 implements com.sun.jna.Structure.ByValue {}
}
