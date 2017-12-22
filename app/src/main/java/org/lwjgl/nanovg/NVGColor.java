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
import java.nio.FloatBuffer;

import static org.lwjgl.nanovg.NanoVG.nativeColorA;
import static org.lwjgl.nanovg.NanoVG.nativeColorB;
import static org.lwjgl.nanovg.NanoVG.nativeColorG;
import static org.lwjgl.nanovg.NanoVG.nativeColorR;


/**
 * A NanoVG color.
 * <p>
 * <h3>Member documentation</h3>
 */
public class NVGColor implements NativeResource {
    
    static {
        System.loadLibrary("nanovg-lib");
    }

    private static final int SIZEOF_FLOAT = 4;
    public static final int SIZEOF = (4 * SIZEOF_FLOAT);
    public static final int RGBA = (0 * SIZEOF_FLOAT);
    public static final int R = (0 * SIZEOF_FLOAT);
    public static final int G = (1 * SIZEOF_FLOAT);
    public static final int B = (2 * SIZEOF_FLOAT);
    public static final int A = (3 * SIZEOF_FLOAT);
    private ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
    private long address = address(container);

    NVGColor(long address, ByteBuffer container) {
        this.address = address;
        this.container = container;
    }

    public ByteBuffer container() {
        return container;
    }

    public static NVGColor create() {
        return new NVGColor(BufferUtils.createByteBuffer(SIZEOF));
    }

    public NVGColor(ByteBuffer container) {
        this(address(container), container);
    }

    public int sizeof() {
        return SIZEOF;
    }

    public static native long address(ByteBuffer byteBuffer);

    public long address() {
        return address;
    }

    public FloatBuffer rgba() {
        return container.asFloatBuffer();
    }

    public float rgba(int index) {
        switch (index) {
            case 0:
                return r();
            case 1:
                return g();
            case 2:
                return b();
            case 3:
                return a();
        }
        return 0;
    }

    public float r() {
        return nr(address());
    }

    public float g() {
        return ng(address());
    }

    public float b() {
        return nb(address());
    }

    public float a() {
        return na(address());
    }
//
//    /**
//     * Copies the specified {@link FloatBuffer} to the {@code rgba} field.
//     */
//    public NVGColor rgba(FloatBuffer value) {
//        nrgba(address(), value);
//        return this;
//    }
//
//    /**
//     * Sets the specified value at the specified index of the {@code rgba} field.
//     */
//    public NVGColor rgba(int index, float value) {
//        nrgba(address(), index, value);
//        return this;
//    }
//

    private static native float nr(long pos);

    private static native float ng(long pos);

    private static native float nb(long pos);

    private static native float na(long pos);

    public NVGColor r(float value) {
        nr(address(), value);
        return this;
    }

    public NVGColor g(float value) {
        ng(address(), value);
        return this;
    }

    public NVGColor b(float value) {
        nb(address(), value);
        return this;
    }

    public NVGColor a(float value) {
        na(address(), value);
        return this;
    }

    public static void nr(long struct, float value) {
        nativeColorR(struct, value);
    }

    public static void ng(long struct, float value) {
        nativeColorG(struct, value);
    }

    public static void nb(long struct, float value) {
        nativeColorB(struct, value);
    }

    public static void na(long struct, float value) {
        nativeColorA(struct, value);
    }

    @Override
    public void free() {

    }

    @Override
    public void close() {

    }

    public void clear() {
        memSet(address(), 0, sizeof());
    }

    public static native long memSet(long ptr, int value, int bytes);

//
//    /**
//     * Unsafe version of {@link #set(NVGColor) set}.
//     */
//    public NVGColor nset(long struct) {
//        memCopy(struct, address(), SIZEOF);
//        return this;
//    }
//
//    /**
//     * Copies the specified struct data to this struct.
//     *
//     * @param src the source struct
//     * @return this struct
//     */
//    public NVGColor set(NVGColor src) {
//        return nset(src.address());
//    }
//
//    // -----------------------------------
//    public static NVGColor create() {
//        return new NVGColor(BufferUtils.createByteBuffer(SIZEOF));
//    }
//
//    /**
//     * Returns a new {@link NVGColor} instance for the specified memory address or {@code null} if the address is {@code NULL}.
//     */
//    public static NVGColor create(long address) {
//        return address == 0L ? null : new NVGColor(address, null);
//    }
//
//    public static Buffer create(int capacity) {
//        return BufferUtils.createByteBuffer(capacity * SIZEOF);
//    }
//
//
//    public static Buffer create(long address, int capacity) {
//        return address == 0L ? null : new Buffer(address, null, -1, 0, capacity, capacity);
//    }
//
//    /**
//     * Unsafe version of {@link #rgba}.
//     */
//    public static FloatBuffer nrgba(long struct) {
//        return memFloatBuffer(struct + NVGColor.RGBA, 4);
//    }
//
//    /**
//     * Unsafe version of {@link #rgba(int) rgba}.
//     */
//    public static float nrgba(long struct, int index) {
//        return memGetFloat(struct + NVGColor.RGBA + index * 4);
//    }
//
//    /**
//     * Unsafe version of {@link #r}.
//     */
//    public static float nr(long struct) {
//        return memGetFloat(struct + NVGColor.R);
//    }
//
//    /**
//     * Unsafe version of {@link #g}.
//     */
//    public static float ng(long struct) {
//        return memGetFloat(struct + NVGColor.G);
//    }
//
//    /**
//     * Unsafe version of {@link #b}.
//     */
//    public static float nb(long struct) {
//        return memGetFloat(struct + NVGColor.B);
//    }
//
//    /**
//     * Unsafe version of {@link #a}.
//     */
//    public static float na(long struct) {
//        return memGetFloat(struct + NVGColor.A);
//    }
//
//    /**
//     * Unsafe version of {@link #rgba(FloatBuffer) rgba}.
//     */
//    public static void nrgba(long struct, FloatBuffer value) {
//        memCopy(memAddress(value), struct + NVGColor.RGBA, value.remaining() * 4);
//    }
//
//    /**
//     * Unsafe version of {@link #rgba(int, float) rgba}.
//     */
//    public static void nrgba(long struct, int index, float value) {
//        memPutFloat(struct + NVGColor.RGBA + index * 4, value);
//    }
//
//    /**
//     * Unsafe version of {@link #r(float) r}.
//     */
//    public static void nr(long struct, float value) {
//        memPutFloat(struct + NVGColor.R, value);
//    }
//
//    /**
//     * Unsafe version of {@link #g(float) g}.
//     */
//    public static void ng(long struct, float value) {
//        memPutFloat(struct + NVGColor.G, value);
//    }
//
//    /**
//     * Unsafe version of {@link #b(float) b}.
//     */
//    public static void nb(long struct, float value) {
//        memPutFloat(struct + NVGColor.B, value);
//    }
//
//    /**
//     * Unsafe version of {@link #a(float) a}.
//     */
//    public static void na(long struct, float value) {
//        memPutFloat(struct + NVGColor.A, value);
//    }
}
