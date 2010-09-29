package com.nativelibs4java.ffmpeg.swscale;
import com.nativelibs4java.ffmpeg.avutil.AvutilLibrary.PixelFormat;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.TypedPointer;
import org.bridj.ValuedEnum;
import org.bridj.ann.CLong;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.bridj.cpp.CPPRuntime;
/**
 * Wrapper for library <b>swscale</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("swscale") 
@Runtime(CPPRuntime.class) 
public class SwscaleLibrary {
	static {
		BridJ.register();
	}
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_AREA = 32;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CPU_CAPS_MMX = -2147483648;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_SINC = 256;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_GAUSS = 128;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final java.lang.String LIBSWSCALE_IDENT = "SwS";
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_SPLINE = 1024;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_SRC_V_CHR_DROP_SHIFT = 16;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_POINT = 16;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_SMPTE240M = 7;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_X = 8;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_DEFAULT = 5;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_ACCURATE_RND = 262144;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_FULL_CHR_H_INP = 16384;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_FULL_CHR_H_INT = 8192;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_BICUBIC = 4;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_SRC_V_CHR_DROP_MASK = 196608;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_ITU709 = 1;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int LIBSWSCALE_VERSION_MICRO = 0;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CPU_CAPS_BFIN = 16777216;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int LIBSWSCALE_VERSION_MINOR = 11;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_BILINEAR = 2;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_PARAM_DEFAULT = 123456;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_BITEXACT = 524288;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_FCC = 4;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_BICUBLIN = 64;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_DIRECT_BGR = 32768;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_ITU624 = 5;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CPU_CAPS_ALTIVEC = 268435456;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_PRINT_INFO = 4096;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final double SWS_MAX_REDUCE_CUTOFF = 0.0020;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_ITU601 = 5;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CS_SMPTE170M = 5;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_FAST_BILINEAR = 1;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_LANCZOS = 512;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int LIBSWSCALE_VERSION_MAJOR = 0;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CPU_CAPS_3DNOW = 1073741824;
	/// <i>native declaration : libswscale/swscale.h</i>
	public static final int SWS_CPU_CAPS_MMX2 = 536870912;
	public native static void swscale_version();
	public native static Pointer<java.lang.Byte > swscale_configuration();
	public native static Pointer<java.lang.Byte > swscale_license();
	public native static Pointer<java.lang.Integer > sws_getCoefficients(int colorspace);
	public native static int sws_isSupportedInput(ValuedEnum<PixelFormat > pix_fmt);
	public native static int sws_isSupportedOutput(ValuedEnum<PixelFormat > pix_fmt);
	public native static void sws_freeContext(SwscaleLibrary.SwsContext swsContext);
	public native static SwscaleLibrary.SwsContext sws_getContext(int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param);
	@Name("sws_getContext")
    public native static @Ptr long sws_getContext$direct(int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param);
	public native static int sws_scale(SwscaleLibrary.SwsContext context, Pointer<Pointer<java.lang.Byte > > srcSlice, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride);
	public native static int sws_scale_ordered(SwscaleLibrary.SwsContext context, Pointer<Pointer<java.lang.Byte > > src, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride);
	public native static int sws_setColorspaceDetails(SwscaleLibrary.SwsContext c, Pointer<java.lang.Integer > inv_table, int srcRange, Pointer<java.lang.Integer > table, int dstRange, int brightness, int contrast, int saturation);
	public native static int sws_getColorspaceDetails(SwscaleLibrary.SwsContext c, Pointer<Pointer<java.lang.Integer > > inv_table, Pointer<java.lang.Integer > srcRange, Pointer<Pointer<java.lang.Integer > > table, Pointer<java.lang.Integer > dstRange, Pointer<java.lang.Integer > brightness, Pointer<java.lang.Integer > contrast, Pointer<java.lang.Integer > saturation);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > sws_allocVec(int length);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > sws_getGaussianVec(double variance, double quality);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > sws_getConstVec(double c, int length);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > sws_getIdentityVec();
	public native static void sws_scaleVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, double scalar);
	public native static void sws_normalizeVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, double height);
	public native static void sws_convVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > b);
	public native static void sws_addVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > b);
	public native static void sws_subVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > b);
	public native static void sws_shiftVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, int shift);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > sws_cloneVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a);
	public native static void sws_printVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a);
	public native static void sws_printVec2(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a, Pointer<? > log_ctx, int log_level);
	public native static void sws_freeVec(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsVector > a);
	public native static Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > sws_getDefaultFilter(float lumaGBlur, float chromaGBlur, float lumaSharpen, float chromaSharpen, float chromaHShift, float chromaVShift, int verbose);
	public native static void sws_freeFilter(Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > filter);
	public native static SwscaleLibrary.SwsContext sws_getCachedContext(SwscaleLibrary.SwsContext context, int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param);
	public native static void sws_convertPalette8ToPacked32(Pointer<java.lang.Byte > src, Pointer<java.lang.Byte > dst, @CLong long num_pixels, Pointer<java.lang.Byte > palette);
	public native static void sws_convertPalette8ToPacked24(Pointer<java.lang.Byte > src, Pointer<java.lang.Byte > dst, @CLong long num_pixels, Pointer<java.lang.Byte > palette);
	/// Pointer to unknown (opaque) type
	public static class SwsContext extends TypedPointer {
		public SwsContext(long address) {
			super(address);
		}
		public SwsContext(Pointer address) {
			super(address);
		}
		public void sws_freeContext() {
			SwscaleLibrary.sws_freeContext(this.getPeer());
		}
		public static SwscaleLibrary.SwsContext sws_getContext(int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param) {
			long $ = SwscaleLibrary.sws_getContext$direct(srcW, srcH, srcFormat, dstW, dstH, dstFormat, flags, srcFilter, dstFilter, param);
			return $ == 0 ? null : new SwscaleLibrary.SwsContext($);
		}
		public int sws_scale(Pointer<Pointer<java.lang.Byte > > srcSlice, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride) {
			return SwscaleLibrary.sws_scale(this.getPeer(), srcSlice, srcStride, srcSliceY, srcSliceH, dst, dstStride);
		}
		public int sws_scale_ordered(Pointer<Pointer<java.lang.Byte > > src, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride) {
			return SwscaleLibrary.sws_scale_ordered(this.getPeer(), src, srcStride, srcSliceY, srcSliceH, dst, dstStride);
		}
		public int sws_setColorspaceDetails(Pointer<java.lang.Integer > inv_table, int srcRange, Pointer<java.lang.Integer > table, int dstRange, int brightness, int contrast, int saturation) {
			return SwscaleLibrary.sws_setColorspaceDetails(this.getPeer(), inv_table, srcRange, table, dstRange, brightness, contrast, saturation);
		}
		public int sws_getColorspaceDetails(Pointer<Pointer<java.lang.Integer > > inv_table, Pointer<java.lang.Integer > srcRange, Pointer<Pointer<java.lang.Integer > > table, Pointer<java.lang.Integer > dstRange, Pointer<java.lang.Integer > brightness, Pointer<java.lang.Integer > contrast, Pointer<java.lang.Integer > saturation) {
			return SwscaleLibrary.sws_getColorspaceDetails(this.getPeer(), inv_table, srcRange, table, dstRange, brightness, contrast, saturation);
		}
		public SwscaleLibrary.SwsContext sws_getCachedContext(int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param) {
			long $ = SwscaleLibrary.sws_getCachedContext(this.getPeer(), srcW, srcH, srcFormat, dstW, dstH, dstFormat, flags, srcFilter, dstFilter, param);
			return $ == 0 ? null : new SwscaleLibrary.SwsContext($);
		}
	};
	private native static void sws_freeContext(@Ptr long swsContext);
	private native static int sws_scale(@Ptr long context, Pointer<Pointer<java.lang.Byte > > srcSlice, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride);
	private native static int sws_scale_ordered(@Ptr long context, Pointer<Pointer<java.lang.Byte > > src, Pointer<java.lang.Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<java.lang.Byte > > dst, Pointer<java.lang.Integer > dstStride);
	private native static int sws_setColorspaceDetails(@Ptr long c, Pointer<java.lang.Integer > inv_table, int srcRange, Pointer<java.lang.Integer > table, int dstRange, int brightness, int contrast, int saturation);
	private native static int sws_getColorspaceDetails(@Ptr long c, Pointer<Pointer<java.lang.Integer > > inv_table, Pointer<java.lang.Integer > srcRange, Pointer<Pointer<java.lang.Integer > > table, Pointer<java.lang.Integer > dstRange, Pointer<java.lang.Integer > brightness, Pointer<java.lang.Integer > contrast, Pointer<java.lang.Integer > saturation);
	@Ptr 
	private native static long sws_getCachedContext(@Ptr long context, int srcW, int srcH, ValuedEnum<PixelFormat > srcFormat, int dstW, int dstH, ValuedEnum<PixelFormat > dstFormat, int flags, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > srcFilter, Pointer<com.nativelibs4java.ffmpeg.swscale.SwsFilter > dstFilter, Pointer<java.lang.Double > param);
}
