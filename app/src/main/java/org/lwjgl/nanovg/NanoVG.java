/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;


/**
 * NanoVG is a small antialiased vector graphics rendering library for OpenGL. It has lean API modeled after HTML5 canvas API. It is aimed to be a
 * practical and fun toolset for building scalable user interfaces and visualizations.
 */
public class NanoVG {

    static {
        System.loadLibrary("nanovg-lib");
    }

    public static final int
            NVG_ANTIALIAS = 1 << 0,
            NVG_STENCIL_STROKES = 1 << 1,
            NVG_DEBUG = 1 << 2;

    /**
     * PI
     */
    public static final float NVG_PI = 3.1415927f;


    public static final int
            NVG_CCW = 0x1,
            NVG_CW = 0x2;

    public static final int
            NVG_SOLID = 0x1,
            NVG_HOLE = 0x2;

    public static final int
            NVG_BUTT = 0,
            NVG_ROUND = 1,
            NVG_SQUARE = 2,
            NVG_BEVEL = 3,
            NVG_MITER = 4;

    public static final int
            NVG_ALIGN_LEFT = 1 << 0,
            NVG_ALIGN_CENTER = 1 << 1,
            NVG_ALIGN_RIGHT = 1 << 2,
            NVG_ALIGN_TOP = 1 << 3,
            NVG_ALIGN_MIDDLE = 1 << 4,
            NVG_ALIGN_BOTTOM = 1 << 5,
            NVG_ALIGN_BASELINE = 1 << 6;

    public static final int
            NVG_ZERO = 1 << 0,
            NVG_ONE = 1 << 1,
            NVG_SRC_COLOR = 1 << 2,
            NVG_ONE_MINUS_SRC_COLOR = 1 << 3,
            NVG_DST_COLOR = 1 << 4,
            NVG_ONE_MINUS_DST_COLOR = 1 << 5,
            NVG_SRC_ALPHA = 1 << 6,
            NVG_ONE_MINUS_SRC_ALPHA = 1 << 7,
            NVG_DST_ALPHA = 1 << 8,
            NVG_ONE_MINUS_DST_ALPHA = 1 << 9,
            NVG_SRC_ALPHA_SATURATE = 1 << 10;

    public static final int
            NVG_SOURCE_OVER = 0,
            NVG_SOURCE_IN = 1,
            NVG_SOURCE_OUT = 2,
            NVG_ATOP = 3,
            NVG_DESTINATION_OVER = 4,
            NVG_DESTINATION_IN = 5,
            NVG_DESTINATION_OUT = 6,
            NVG_DESTINATION_ATOP = 7,
            NVG_LIGHTER = 8,
            NVG_COPY = 9,
            NVG_XOR = 10;

    public static final int
            NVG_IMAGE_GENERATE_MIPMAPS = 1 << 0,
            NVG_IMAGE_REPEATX = 1 << 1,
            NVG_IMAGE_REPEATY = 1 << 2,
            NVG_IMAGE_FLIPY = 1 << 3,
            NVG_IMAGE_PREMULTIPLIED = 1 << 4;


    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    public static native void nvgEndFrame(long ctx);

    public static native float nvgDegToRad(float deg);

    public static native void nativeColorR(long ptr, float value);

    public static native void nativeColorG(long ptr, float value);

    public static native void nativeColorB(long ptr, float value);

    public static native void nativeColorA(long ptr, float value);

    public static native void nvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir);

    public static native void nvgBeginFrame(long ctx, int windowWidth, int windowHeight, float devicePixelRatio);

    public static native long memAddress(ByteBuffer byteBuffer);

    public static native void nvgBeginPath(long ctx);

    public static native void nvgMoveTo(long ctx, float x, float y);

    public static native void nvgLineTo(long ctx, float x, float y);

    public static native void nvgClosePath(long ctx);

    public static native long nvgCreateGL3(int flags);

    public static native long ping();

    public static native void nvgFillColor(long ctx, long color);

    public static void nvgFillColor(long ctx, NVGColor color) {
        nvgFillColor(ctx, color.address());
    }

    public static native void nvgFill(long ctx);

    public static native void nvgFontFace(long ctx, long font);

    public static void nvgFontFace(long ctx, ByteBuffer font) {
        nvgFontFace(ctx, memAddress(font));
    }

    public static void nvgFontFace(long ctx, CharSequence font) {
        byte[] bb = font.toString().getBytes();
        ByteBuffer fontEncoded = ByteBuffer.allocateDirect(bb.length).order(ByteOrder.nativeOrder()).put(bb);
        fontEncoded.rewind();
        nvgFontFace(ctx, fontEncoded);
    }

    public static native void nvgTextAlign(long ctx, int align);

    public static native void nvgFontSize(long ctx, float size);

    public static native float nnvgText(long ctx, float x, float y, long string, long end);

    public static float nvgText(long ctx, float x, float y, ByteBuffer string) {
        return nnvgText(ctx, x, y, memAddress(string), memAddress(string) + string.remaining());
    }

    public static float nvgText(long ctx, float x, float y, CharSequence string) {
        byte[] bb = string.toString().getBytes(StandardCharsets.UTF_8);
        ByteBuffer fontEncoded = ByteBuffer.allocateDirect(bb.length).order(ByteOrder.nativeOrder()).put(bb);
        fontEncoded.rewind();
        return nnvgText(ctx, x, y, memAddress(fontEncoded), memAddress(fontEncoded) + fontEncoded.remaining());
    }

    public static native void nvgStrokeColor(long ctx, long color);

    public static void nvgStrokeColor(long ctx, NVGColor color) {
        nvgStrokeColor(ctx, color.address());
    }

    public static native void nvgStrokeWidth(long ctx, float size);

    public static native void nvgStroke(long ctx);

    public static int nvgCreateImageMem(long ctx, int imageFlags, ByteBuffer data) {
        return nvgCreateImageMem(ctx, imageFlags, memAddress(data), data.remaining());
    }

    public static native int nvgCreateImageMem(long ctx, int imageFlags, long data, int ndata);

    public static int nvgCreateFontMem(long ctx, CharSequence fontName, ByteBuffer fontData, int freeData) {
        byte[] bb = fontName.toString().getBytes(StandardCharsets.US_ASCII);
        ByteBuffer nameEncoded = ByteBuffer.allocateDirect(bb.length).order(ByteOrder.nativeOrder()).put(bb);
        nameEncoded.rewind();
        return nvgCreateFontMem(ctx, memAddress(nameEncoded), memAddress(fontData), fontData.remaining(), freeData);
    }

    public static native int nvgCreateFontMem(long ctx, long name, long data, int ndata, int freeData);

    public static NVGPaint nvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, NVGPaint __result) {
        nvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
        return __result;
    }

    public static native void nvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, long __result);

    public static native void nvgRoundedRect(long ctx, float x, float y, float w, float h, float r);

    public static native void nvgFillPaint(long ctx, long paint);

    public static void nvgFillPaint(long ctx, NVGPaint paint) {
        nvgFillPaint(ctx, paint.address());
    }

    public static native void nnvgDeleteImage(long ctx, int image);

    public static void nvgDeleteImage(long ctx, int image) {
        nnvgDeleteImage(ctx, image);
    }
}