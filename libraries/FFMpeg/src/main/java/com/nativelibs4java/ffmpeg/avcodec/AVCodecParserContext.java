package com.nativelibs4java.ffmpeg.avcodec;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavcodec/avcodec.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVCodecParserContext extends StructObject {
	public AVCodecParserContext() {
		super();
	}
	public AVCodecParserContext(Pointer pointer) {
		super(pointer);
	}
	/// C type : void*
	@Field(0) 
	public Pointer<? > priv_data() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : void*
	@Field(0) 
	public AVCodecParserContext priv_data(Pointer<? > priv_data) {
		this.io.setPointerField(this, 0, priv_data);
		return this;
	}
	/// C type : void*
	public final Pointer<? > priv_data_$eq(Pointer<? > priv_data) {
		priv_data(priv_data);
		return priv_data;
	}
	/// C type : AVCodecParser*
	@Field(1) 
	public Pointer<com.nativelibs4java.ffmpeg.avcodec.AVCodecParser > parser() {
		return this.io.getPointerField(this, 1);
	}
	/// C type : AVCodecParser*
	@Field(1) 
	public AVCodecParserContext parser(Pointer<com.nativelibs4java.ffmpeg.avcodec.AVCodecParser > parser) {
		this.io.setPointerField(this, 1, parser);
		return this;
	}
	/// C type : AVCodecParser*
	public final Pointer<com.nativelibs4java.ffmpeg.avcodec.AVCodecParser > parser_$eq(Pointer<com.nativelibs4java.ffmpeg.avcodec.AVCodecParser > parser) {
		parser(parser);
		return parser;
	}
	/// offset of the current frame
	@Field(2) 
	public long frame_offset() {
		return this.io.getLongField(this, 2);
	}
	/// offset of the current frame
	@Field(2) 
	public AVCodecParserContext frame_offset(long frame_offset) {
		this.io.setLongField(this, 2, frame_offset);
		return this;
	}
	public final long frame_offset_$eq(long frame_offset) {
		frame_offset(frame_offset);
		return frame_offset;
	}
	/**
	 * current offset<br>
	 * (incremented by each av_parser_parse())
	 */
	@Field(3) 
	public long cur_offset() {
		return this.io.getLongField(this, 3);
	}
	/**
	 * current offset<br>
	 * (incremented by each av_parser_parse())
	 */
	@Field(3) 
	public AVCodecParserContext cur_offset(long cur_offset) {
		this.io.setLongField(this, 3, cur_offset);
		return this;
	}
	public final long cur_offset_$eq(long cur_offset) {
		cur_offset(cur_offset);
		return cur_offset;
	}
	/// offset of the next frame
	@Field(4) 
	public long next_frame_offset() {
		return this.io.getLongField(this, 4);
	}
	/// offset of the next frame
	@Field(4) 
	public AVCodecParserContext next_frame_offset(long next_frame_offset) {
		this.io.setLongField(this, 4, next_frame_offset);
		return this;
	}
	public final long next_frame_offset_$eq(long next_frame_offset) {
		next_frame_offset(next_frame_offset);
		return next_frame_offset;
	}
	/**
	 * video info<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(5) 
	public int pict_type() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * video info<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(5) 
	public AVCodecParserContext pict_type(int pict_type) {
		this.io.setIntField(this, 5, pict_type);
		return this;
	}
	public final int pict_type_$eq(int pict_type) {
		pict_type(pict_type);
		return pict_type;
	}
	/**
	 * This field is used for proper frame duration computation in lavf.<br>
	 * It signals, how much longer the frame duration of the current frame<br>
	 * is compared to normal frame duration.<br>
	 * * frame_duration = (1 + repeat_pict) * time_base<br>
	 * * It is used by codecs like H.264 to display telecined material.<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(6) 
	public int repeat_pict() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * This field is used for proper frame duration computation in lavf.<br>
	 * It signals, how much longer the frame duration of the current frame<br>
	 * is compared to normal frame duration.<br>
	 * * frame_duration = (1 + repeat_pict) * time_base<br>
	 * * It is used by codecs like H.264 to display telecined material.<br>
	 * XXX: Put it back in AVCodecContext.
	 */
	@Field(6) 
	public AVCodecParserContext repeat_pict(int repeat_pict) {
		this.io.setIntField(this, 6, repeat_pict);
		return this;
	}
	public final int repeat_pict_$eq(int repeat_pict) {
		repeat_pict(repeat_pict);
		return repeat_pict;
	}
	/// pts of the current frame
	@Field(7) 
	public long pts() {
		return this.io.getLongField(this, 7);
	}
	/// pts of the current frame
	@Field(7) 
	public AVCodecParserContext pts(long pts) {
		this.io.setLongField(this, 7, pts);
		return this;
	}
	public final long pts_$eq(long pts) {
		pts(pts);
		return pts;
	}
	/// dts of the current frame
	@Field(8) 
	public long dts() {
		return this.io.getLongField(this, 8);
	}
	/// dts of the current frame
	@Field(8) 
	public AVCodecParserContext dts(long dts) {
		this.io.setLongField(this, 8, dts);
		return this;
	}
	public final long dts_$eq(long dts) {
		dts(dts);
		return dts;
	}
	/// private data
	@Field(9) 
	public long last_pts() {
		return this.io.getLongField(this, 9);
	}
	/// private data
	@Field(9) 
	public AVCodecParserContext last_pts(long last_pts) {
		this.io.setLongField(this, 9, last_pts);
		return this;
	}
	public final long last_pts_$eq(long last_pts) {
		last_pts(last_pts);
		return last_pts;
	}
	@Field(10) 
	public long last_dts() {
		return this.io.getLongField(this, 10);
	}
	@Field(10) 
	public AVCodecParserContext last_dts(long last_dts) {
		this.io.setLongField(this, 10, last_dts);
		return this;
	}
	public final long last_dts_$eq(long last_dts) {
		last_dts(last_dts);
		return last_dts;
	}
	@Field(11) 
	public int fetch_timestamp() {
		return this.io.getIntField(this, 11);
	}
	@Field(11) 
	public AVCodecParserContext fetch_timestamp(int fetch_timestamp) {
		this.io.setIntField(this, 11, fetch_timestamp);
		return this;
	}
	public final int fetch_timestamp_$eq(int fetch_timestamp) {
		fetch_timestamp(fetch_timestamp);
		return fetch_timestamp;
	}
	@Field(12) 
	public int cur_frame_start_index() {
		return this.io.getIntField(this, 12);
	}
	@Field(12) 
	public AVCodecParserContext cur_frame_start_index(int cur_frame_start_index) {
		this.io.setIntField(this, 12, cur_frame_start_index);
		return this;
	}
	public final int cur_frame_start_index_$eq(int cur_frame_start_index) {
		cur_frame_start_index(cur_frame_start_index);
		return cur_frame_start_index;
	}
	/// C type : int64_t[4]
	@Array({4}) 
	@Field(13) 
	public Pointer<java.lang.Long > cur_frame_offset() {
		return this.io.getPointerField(this, 13);
	}
	/// C type : int64_t[4]
	@Array({4}) 
	@Field(14) 
	public Pointer<java.lang.Long > cur_frame_pts() {
		return this.io.getPointerField(this, 14);
	}
	/// C type : int64_t[4]
	@Array({4}) 
	@Field(15) 
	public Pointer<java.lang.Long > cur_frame_dts() {
		return this.io.getPointerField(this, 15);
	}
	@Field(16) 
	public int flags() {
		return this.io.getIntField(this, 16);
	}
	@Field(16) 
	public AVCodecParserContext flags(int flags) {
		this.io.setIntField(this, 16, flags);
		return this;
	}
	public final int flags_$eq(int flags) {
		flags(flags);
		return flags;
	}
	/// < byte offset from starting packet start
	@Field(17) 
	public long offset() {
		return this.io.getLongField(this, 17);
	}
	/// < byte offset from starting packet start
	@Field(17) 
	public AVCodecParserContext offset(long offset) {
		this.io.setLongField(this, 17, offset);
		return this;
	}
	public final long offset_$eq(long offset) {
		offset(offset);
		return offset;
	}
	/// C type : int64_t[4]
	@Array({4}) 
	@Field(18) 
	public Pointer<java.lang.Long > cur_frame_end() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * Set by parser to 1 for key frames and 0 for non-key frames.<br>
	 * It is initialized to -1, so if the parser doesn't set this flag,<br>
	 * old-style fallback using FF_I_TYPE picture type as key frames<br>
	 * will be used.
	 */
	@Field(19) 
	public int key_frame() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * Set by parser to 1 for key frames and 0 for non-key frames.<br>
	 * It is initialized to -1, so if the parser doesn't set this flag,<br>
	 * old-style fallback using FF_I_TYPE picture type as key frames<br>
	 * will be used.
	 */
	@Field(19) 
	public AVCodecParserContext key_frame(int key_frame) {
		this.io.setIntField(this, 19, key_frame);
		return this;
	}
	public final int key_frame_$eq(int key_frame) {
		key_frame(key_frame);
		return key_frame;
	}
	/**
	 * Time difference in stream time base units from the pts of this<br>
	 * packet to the point at which the output from the decoder has converged<br>
	 * independent from the availability of previous frames. That is, the<br>
	 * frames are virtually identical no matter if decoding started from<br>
	 * the very first frame or from this keyframe.<br>
	 * Is AV_NOPTS_VALUE if unknown.<br>
	 * This field is not the display duration of the current frame.<br>
	 * * The purpose of this field is to allow seeking in streams that have no<br>
	 * keyframes in the conventional sense. It corresponds to the<br>
	 * recovery point SEI in H.264 and match_time_delta in NUT. It is also<br>
	 * essential for some types of subtitle streams to ensure that all<br>
	 * subtitles are correctly displayed after seeking.
	 */
	@Field(20) 
	public long convergence_duration() {
		return this.io.getLongField(this, 20);
	}
	/**
	 * Time difference in stream time base units from the pts of this<br>
	 * packet to the point at which the output from the decoder has converged<br>
	 * independent from the availability of previous frames. That is, the<br>
	 * frames are virtually identical no matter if decoding started from<br>
	 * the very first frame or from this keyframe.<br>
	 * Is AV_NOPTS_VALUE if unknown.<br>
	 * This field is not the display duration of the current frame.<br>
	 * * The purpose of this field is to allow seeking in streams that have no<br>
	 * keyframes in the conventional sense. It corresponds to the<br>
	 * recovery point SEI in H.264 and match_time_delta in NUT. It is also<br>
	 * essential for some types of subtitle streams to ensure that all<br>
	 * subtitles are correctly displayed after seeking.
	 */
	@Field(20) 
	public AVCodecParserContext convergence_duration(long convergence_duration) {
		this.io.setLongField(this, 20, convergence_duration);
		return this;
	}
	public final long convergence_duration_$eq(long convergence_duration) {
		convergence_duration(convergence_duration);
		return convergence_duration;
	}
	/**
	 * Synchronization point for start of timestamp generation.<br>
	 * * Set to >0 for sync point, 0 for no sync point and <0 for undefined<br>
	 * (default).<br>
	 * * For example, this corresponds to presence of H.264 buffering period<br>
	 * SEI message.
	 */
	@Field(21) 
	public int dts_sync_point() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * Synchronization point for start of timestamp generation.<br>
	 * * Set to >0 for sync point, 0 for no sync point and <0 for undefined<br>
	 * (default).<br>
	 * * For example, this corresponds to presence of H.264 buffering period<br>
	 * SEI message.
	 */
	@Field(21) 
	public AVCodecParserContext dts_sync_point(int dts_sync_point) {
		this.io.setIntField(this, 21, dts_sync_point);
		return this;
	}
	public final int dts_sync_point_$eq(int dts_sync_point) {
		dts_sync_point(dts_sync_point);
		return dts_sync_point;
	}
	/**
	 * Offset of the current timestamp against last timestamp sync point in<br>
	 * units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain a valid timestamp offset.<br>
	 * * Note that the timestamp of sync point has usually a nonzero<br>
	 * dts_ref_dts_delta, which refers to the previous sync point. Offset of<br>
	 * the next frame after timestamp sync point will be usually 1.<br>
	 * * For example, this corresponds to H.264 cpb_removal_delay.
	 */
	@Field(22) 
	public int dts_ref_dts_delta() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * Offset of the current timestamp against last timestamp sync point in<br>
	 * units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain a valid timestamp offset.<br>
	 * * Note that the timestamp of sync point has usually a nonzero<br>
	 * dts_ref_dts_delta, which refers to the previous sync point. Offset of<br>
	 * the next frame after timestamp sync point will be usually 1.<br>
	 * * For example, this corresponds to H.264 cpb_removal_delay.
	 */
	@Field(22) 
	public AVCodecParserContext dts_ref_dts_delta(int dts_ref_dts_delta) {
		this.io.setIntField(this, 22, dts_ref_dts_delta);
		return this;
	}
	public final int dts_ref_dts_delta_$eq(int dts_ref_dts_delta) {
		dts_ref_dts_delta(dts_ref_dts_delta);
		return dts_ref_dts_delta;
	}
	/**
	 * Presentation delay of current frame in units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain valid non-negative timestamp delta (presentation time of a frame<br>
	 * must not lie in the past).<br>
	 * * This delay represents the difference between decoding and presentation<br>
	 * time of the frame.<br>
	 * * For example, this corresponds to H.264 dpb_output_delay.
	 */
	@Field(23) 
	public int pts_dts_delta() {
		return this.io.getIntField(this, 23);
	}
	/**
	 * Presentation delay of current frame in units of AVCodecContext.time_base.<br>
	 * * Set to INT_MIN when dts_sync_point unused. Otherwise, it must<br>
	 * contain valid non-negative timestamp delta (presentation time of a frame<br>
	 * must not lie in the past).<br>
	 * * This delay represents the difference between decoding and presentation<br>
	 * time of the frame.<br>
	 * * For example, this corresponds to H.264 dpb_output_delay.
	 */
	@Field(23) 
	public AVCodecParserContext pts_dts_delta(int pts_dts_delta) {
		this.io.setIntField(this, 23, pts_dts_delta);
		return this;
	}
	public final int pts_dts_delta_$eq(int pts_dts_delta) {
		pts_dts_delta(pts_dts_delta);
		return pts_dts_delta;
	}
	/**
	 * Position of the packet in file.<br>
	 * * Analogous to cur_frame_pts/dts<br>
	 * C type : int64_t[4]
	 */
	@Array({4}) 
	@Field(24) 
	public Pointer<java.lang.Long > cur_frame_pos() {
		return this.io.getPointerField(this, 24);
	}
	/// Byte position of currently parsed frame in stream.
	@Field(25) 
	public long pos() {
		return this.io.getLongField(this, 25);
	}
	/// Byte position of currently parsed frame in stream.
	@Field(25) 
	public AVCodecParserContext pos(long pos) {
		this.io.setLongField(this, 25, pos);
		return this;
	}
	public final long pos_$eq(long pos) {
		pos(pos);
		return pos;
	}
	/// Previous frame byte position.
	@Field(26) 
	public long last_pos() {
		return this.io.getLongField(this, 26);
	}
	/// Previous frame byte position.
	@Field(26) 
	public AVCodecParserContext last_pos(long last_pos) {
		this.io.setLongField(this, 26, last_pos);
		return this;
	}
	public final long last_pos_$eq(long last_pos) {
		last_pos(last_pos);
		return last_pos;
	}
}
