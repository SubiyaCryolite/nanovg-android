/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.NativeResource;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static org.lwjgl.nanovg.NanoVG.memAddress;

public class NVGPaint implements NativeResource {

    private static final int SIZEOF_FLOAT = 4;
    private static final int SIZEOF_INT = 4;
    public static final int SIZEOF = (6 * SIZEOF_FLOAT) +
            (2 * SIZEOF_FLOAT) +
            (2 * SIZEOF_FLOAT) +
            (1 * SIZEOF_INT) +
            (2 * 4 * SIZEOF_FLOAT);


    public static final int ALIGNOF;

    /**
     * The struct member offsets.
     */
    public static final int
            XFORM,
            EXTENT,
            RADIUS,
            FEATHER,
            INNERCOLOR,
            OUTERCOLOR,
            IMAGE;

    static {
        ALIGNOF = 0;
        XFORM = 0;
        EXTENT = 24;
        RADIUS = 32;
        FEATHER = 36;
        INNERCOLOR = 40;
        OUTERCOLOR = 56;
        IMAGE = 72;
    }

    private ByteBuffer container = ByteBuffer.allocateDirect(SIZEOF).order(ByteOrder.nativeOrder());
    private long address = address(container);


    public static NVGPaint create() {
        return new NVGPaint(BufferUtils.createByteBuffer(SIZEOF));
    }

    public static NVGPaint create(long address) {
        return address == 0L ? null : new NVGPaint(address, null);
    }

    NVGPaint(long address, ByteBuffer container) {
        this.address = address;
        this.container = container;
    }

    public NVGPaint(ByteBuffer container) {
        this(memAddress(container), container);
    }

    public int sizeof() {
        return SIZEOF;
    }

    public long address() {
        return address;
    }

    public static native long address(ByteBuffer byteBuffer);

    /*
    public FloatBuffer xform() {
        return nxform(address());
    }

    public float xform(int index) {
        return nxform(address(), index);
    }

    public FloatBuffer extent() {
        return nextent(address());
    }

    public float extent(int index) {
        return nextent(address(), index);
    }

    public float radius() {
        return nradius(address());
    }

    public float feather() {
        return nfeather(address());
    }

    public NVGColor innerColor() {
        return ninnerColor(address());
    }

    public NVGColor outerColor() {
        return nouterColor(address());
    }

    public int image() {
        return nimage(address());
    }

    public NVGPaint xform(FloatBuffer value) {
        nxform(address(), value);
        return this;
    }

    public NVGPaint xform(int index, float value) {
        nxform(address(), index, value);
        return this;
    }

    public NVGPaint extent(FloatBuffer value) {
        nextent(address(), value);
        return this;
    }

    public NVGPaint extent(int index, float value) {
        nextent(address(), index, value);
        return this;
    }

    public NVGPaint radius(float value) {
        nradius(address(), value);
        return this;
    }

    public NVGPaint feather(float value) {
        nfeather(address(), value);
        return this;
    }

    public NVGPaint innerColor(NVGColor value) {
        ninnerColor(address(), value);
        return this;
    }

    public NVGPaint outerColor(NVGColor value) {
        nouterColor(address(), value);
        return this;
    }
    */

    /*
    public NVGPaint nset(long struct) {
        memCopy(struct, address(), SIZEOF);
        return this;
    }

    public NVGPaint set(NVGPaint src) {
        return nset(src.address());
    }

    public static NVGPaint malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    public static NVGPaint calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    public static Buffer create(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    public static FloatBuffer nxform(long struct) {
        return memFloatBuffer(struct + NVGPaint.XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return memGetFloat(struct + NVGPaint.XFORM + index * 4);
    }

    public static FloatBuffer nextent(long struct) {
        return memFloatBuffer(struct + NVGPaint.EXTENT, 2);
    }

    public static float nextent(long struct, int index) {
        return memGetFloat(struct + NVGPaint.EXTENT + index * 4);
    }

    public static float nradius(long struct) {
        return memGetFloat(struct + NVGPaint.RADIUS);
    }

    public static float nfeather(long struct) {
        return memGetFloat(struct + NVGPaint.FEATHER);
    }


    public static NVGColor ninnerColor(long struct) {
        return NVGColor.create(struct + NVGPaint.INNERCOLOR);
    }

    public static NVGColor nouterColor(long struct) {
        return NVGColor.create(struct + NVGPaint.OUTERCOLOR);
    }

    public static int nimage(long struct) {
        return memGetInt(struct + NVGPaint.IMAGE);
    }

    public static void nxform(long struct, FloatBuffer value) {
        memCopy(memAddress(value), struct + NVGPaint.XFORM, value.remaining() * 4);
    }

    public static void nxform(long struct, int index, float value) {
        memPutFloat(struct + NVGPaint.XFORM + index * 4, value);
    }

    public static void nextent(long struct, FloatBuffer value) {
        memCopy(memAddress(value), struct + NVGPaint.EXTENT, value.remaining() * 4);
    }

    public static void nextent(long struct, int index, float value) {
        memPutFloat(struct + NVGPaint.EXTENT + index * 4, value);
    }

    public static void nradius(long struct, float value) {
        memPutFloat(struct + NVGPaint.RADIUS, value);
    }

    public static void nfeather(long struct, float value) {
        memPutFloat(struct + NVGPaint.FEATHER, value);
    }

    public static void ninnerColor(long struct, NVGColor value) {
        memCopy(value.address(), struct + NVGPaint.INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void nouterColor(long struct, NVGColor value) {
        memCopy(value.address(), struct + NVGPaint.OUTERCOLOR, NVGColor.SIZEOF);
    }

    public static void nimage(long struct, int value) {
        memPutInt(struct + NVGPaint.IMAGE, value);
    }
*/
    @Override
    public void free() {

    }

    @Override
    public void close() {

    }
}