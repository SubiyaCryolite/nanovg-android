/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

public interface NativeResource  {

    /** Frees any native resources held by this object. */
    void free();

    void close();
}