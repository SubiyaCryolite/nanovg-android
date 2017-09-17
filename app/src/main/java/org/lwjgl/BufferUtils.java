/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;


/**
 * <p>This class makes it easy and safe to work with direct buffers. It is the recommended way to allocate memory to use with LWJGL.</p>
 *
 * <h3>Direct buffers</h3>
 *
 * <p>LWJGL requires that all NIO buffers passed to it are direct buffers. Direct buffers essentially wrap an address that points to off-heap memory, i.e. a
 * native pointer. This is the only way LWJGL can safely pass data from Java code to native code, and vice-versa, without a performance penalty. It does not
 * support on-heap Java arrays (or plain NIO buffers, which wrap them) because arrays may be moved around in memory by the JVM's garbage collector while native
 * code is accessing them. In addition, Java arrays have an unspecified layout, i.e. they are not necessarily contiguous in memory.</p>
 *
 * <h3>Usage</h3>
 *
 * <p>When a direct buffer is passed as an argument to an LWJGL method, no data is copied. Instead, the current buffer position is added to the buffer's memory
 * address and the resulting value is passed to native code. The native code interprets that value as a pointer and reads or copies from it as necessary. LWJGL
 * will often also use the current buffer limit (via {@link Buffer#remaining()}) to automatically pass length/maxlength arguments. This means that, just like
 * other APIs that use NIO buffers, the current {@link Buffer#position()} and {@link Buffer#limit()} at the time of the call is very important. Contrary to
 * other APIs, LWJGL never modifies the current position, it will be the same value before and after the call.</p>
 *
 * <h3>Arrays of pointers</h3>
 *
 * <h3>Memory management</h3>
 *
 * <p>Using NIO buffers for off-heap memory has some drawbacks:</p>
 * <ul>
 * <li>Memory blocks bigger than {@link Integer#MAX_VALUE} bytes cannot be allocated.</li>
 * <li>Memory blocks are zeroed-out on allocation, for safety. This has (sometimes unwanted) performance implications.</li>
 * <li>There is no way to free a buffer explicitly (without JVM specific reflection). Buffer objects are subject to GC and it usually takes two GC cycles to
 * free the off-heap memory after the buffer object becomes unreachable.</li>
 * </ul>
 *
 *
 * <h3>Memory alignment</h3>
 *
 * <p>Allocations done via this class have a guaranteed alignment of 8 bytes. If higher alignment values are required, use the explicit memory management API
 * or pad the requested memory with extra bytes and align manually.</p>
 *
 * <h3>Structs and arrays of structs</h3>
 *
 * <p>Java does not support struct value types, so LWJGL requires struct values that are backed by off-heap memory. Each struct type defined in a binding
 * has a corresponding class in LWJGL that can be used to access its members. Each struct class also has a {@code Buffer} inner class that can be used to
 * access (packed) arrays of struct values. Both struct and struct buffer classes may be backed by direct {@link ByteBuffer}s allocated from this class, but it
 * is highly recommended to use explicit memory management for performance.</p>
 */
public final class BufferUtils {

	private BufferUtils() {}

	/**
	 * Allocates a direct native-ordered bytebuffer with the specified capacity.
	 *
	 * @param capacity The capacity, in bytes
	 *
	 * @return a ByteBuffer
	 */
	public static ByteBuffer createByteBuffer(int capacity) {
		return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
	}

	/**
	 * Allocates a direct native-order shortbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in shorts
	 *
	 * @return a ShortBuffer
	 */
	public static ShortBuffer createShortBuffer(int capacity) {
		return createByteBuffer(capacity << 1).asShortBuffer();
	}

	/**
	 * Allocates a direct native-order charbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in chars
	 *
	 * @return an CharBuffer
	 */
	public static CharBuffer createCharBuffer(int capacity) {
		return createByteBuffer(capacity << 1).asCharBuffer();
	}

	/**
	 * Allocates a direct native-order intbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in ints
	 *
	 * @return an IntBuffer
	 */
	public static IntBuffer createIntBuffer(int capacity) {
		return createByteBuffer(capacity << 2).asIntBuffer();
	}

	/**
	 * Allocates a direct native-order longbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in longs
	 *
	 * @return an LongBuffer
	 */
	public static LongBuffer createLongBuffer(int capacity) {
		return createByteBuffer(capacity << 3).asLongBuffer();
	}

	/**
	 * Allocates a direct native-order floatbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in floats
	 *
	 * @return a FloatBuffer
	 */
	public static FloatBuffer createFloatBuffer(int capacity) {
		return createByteBuffer(capacity << 2).asFloatBuffer();
	}

	/**
	 * Allocates a direct native-order doublebuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in doubles
	 *
	 * @return a DoubleBuffer
	 */
	public static DoubleBuffer createDoubleBuffer(int capacity) {
		return createByteBuffer(capacity << 3).asDoubleBuffer();
	}
}
