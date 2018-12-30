#include <jni.h>
#define NANOVG_GLES3_IMPLEMENTATION

#include "nanovg.h"
#include "nanovg_gl.h"

extern "C" {

JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NVGColor_memSet(JNIEnv *env, jclass type, jlong ptr, jint value, jint bytes) {
    memset((void *) ptr, value, bytes);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgDeleteImage(JNIEnv *env, jclass type, jlong ctx, jint image) {
    nvgDeleteImage((NVGcontext *) ctx, image);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgFillPaint__JJ(JNIEnv *env, jclass type, jlong ctx, NVGpaint paint) {
    nvgFillPaint((NVGcontext *) ctx, paint);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgRoundedRect(JNIEnv *env, jclass type, jlong ctx, jfloat x, jfloat y,
                                            jfloat w, jfloat h, jfloat r) {
    nvgRoundedRect((NVGcontext *) ctx, x, y, w, h, r);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgImagePattern__JFFFFFIFJ(JNIEnv *env, jclass type, jlong ctx,
                                                        jfloat ox, jfloat oy, jfloat ex, jfloat ey,
                                                        jfloat angle, jint image, jfloat alpha,
                                                        NVGpaint result) {
    result = nvgImagePattern((NVGcontext *) ctx, ox, oy, ex, ey, angle, image, alpha);

}

JNIEXPORT jint JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgCreateFontMem__JJJII(JNIEnv *env, jclass type, jlong ctx,
                                                     jlong name, jlong data, jint ndata,
                                                     jint freeData) {

    return nvgCreateFontMem((NVGcontext *) ctx, (const char *) name, (unsigned char *) data, ndata,
                            freeData);
}

JNIEXPORT jint JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgCreateImageMem__JIJI(JNIEnv *env, jclass type, jlong ctx,
                                                     jint imageFlags, jlong data, jint ndata) {
    return nvgCreateImageMem((NVGcontext *) ctx, imageFlags, (unsigned char *) data, ndata);
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NVGColor_nr__J(JNIEnv *env, jclass type, jlong pos) {
    return ((NVGcolor *) pos)->r;
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NVGColor_ng__J(JNIEnv *env, jclass type, jlong pos) {
    return ((NVGcolor *) pos)->g;
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NVGColor_nb__J(JNIEnv *env, jclass type, jlong pos) {
    return ((NVGcolor *) pos)->b;
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NVGColor_na__J(JNIEnv *env, jclass type, jlong pos) {
    return ((NVGcolor *) pos)->a;
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgDegToRad(JNIEnv *env, jclass type, jfloat deg) {
    return nvgDegToRad(deg);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgEndFrame(JNIEnv *env, jclass type, jlong ctx) {
    nvgEndFrame((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgBeginFrame(JNIEnv *env, jclass type, jlong ctx, jint windowWidth,
                                           jint windowHeight, jfloat devicePixelRatio) {
    nvgBeginFrame((NVGcontext *) ctx, windowWidth, windowHeight, devicePixelRatio);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nativeColorR(JNIEnv *env, jclass type, jlong ptr, jfloat value) {
    ((NVGcolor *) ptr)->r = value;
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nativeColorG(JNIEnv *env, jclass type, jlong ptr, jfloat value) {
    ((NVGcolor *) ptr)->g = value;
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgArc(JNIEnv *env, jclass type, jlong ctx, jfloat cx, jfloat cy,
                                    jfloat r, jfloat a0, jfloat a1, jint dir) {

    nvgArc((NVGcontext *) ctx, cx, cy, r, a0, a1, dir);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nativeColorB(JNIEnv *env, jclass type, jlong ptr, jfloat value) {
    ((NVGcolor *) ptr)->b = value;
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nativeColorA(JNIEnv *env, jclass type, jlong ptr, jfloat value) {
    ((NVGcolor *) ptr)->a = value;
}

JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NanoVG_ping(JNIEnv *env, jclass type) {
    return 12345;
}

JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgCreateGL3(JNIEnv *env, jclass type, jint flags) {
    return (jlong) nvgCreateGLES3(flags);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgSave(JNIEnv *env, jclass type, jlong ctx) {
    nvgSave((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgResetTransform(JNIEnv *env, jclass type, jlong ctx) {
    nvgResetTransform((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgTransform(JNIEnv *env, jclass type, jlong ctx, jfloat a, jfloat b,
                                           jfloat c, jfloat d, jfloat e, jfloat f) {
    nvgTransform((NVGcontext *) ctx, a, b, c, d, e, f);

}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgTransformScale__JFF(JNIEnv *env, jclass type, jlong dst, jfloat sx,
                                                     jfloat sy) {
    nvgTransformScale((float *) dst, sx, sy);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgTransformTranslate__JFF(JNIEnv *env, jclass type, jlong dst,
                                                         jfloat tx, jfloat ty) {
    nvgTransformTranslate((float *) dst, tx, ty);
}

JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NanoVG_memAddress(JNIEnv *env, jclass type, jobject byteBuffer) {
    return (jlong) env->GetDirectBufferAddress(byteBuffer);
}


JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NVGPaint_address__Ljava_nio_ByteBuffer_2(JNIEnv *env, jclass type,
                                                               jobject byteBuffer) {
    return Java_org_lwjgl_nanovg_NanoVG_memAddress(env, type, byteBuffer);
}


JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgBeginPath(JNIEnv *env, jclass type, jlong ctx) {
    nvgBeginPath((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgMoveTo(JNIEnv *env, jclass type, jlong ctx, jfloat x, jfloat y) {
    nvgMoveTo((NVGcontext *) ctx, x, y);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgLineTo(JNIEnv *env, jclass type, jlong ctx, jfloat x, jfloat y) {
    nvgLineTo((NVGcontext *) ctx, x, y);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgClosePath(JNIEnv *env, jclass type, jlong ctx) {
    nvgClosePath((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgFillColor(JNIEnv *env, jclass type, jlong ctx, NVGcolor color) {
    nvgFillColor((NVGcontext *) ctx, color);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgFontFace__JJ(JNIEnv *env, jclass type, jlong ctx, jlong font) {
    nvgFontFace((NVGcontext *) ctx, (const char *) font);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgFill(JNIEnv *env, jclass type, jlong ctx) {
    nvgFill((NVGcontext *) ctx);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgTextAlign(JNIEnv *env, jclass type, jlong ctx, jint align) {
    nvgTextAlign((NVGcontext *) ctx, align);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgFontSize(JNIEnv *env, jclass type, jlong ctx, jfloat size) {
    nvgFontSize((NVGcontext *) ctx, size);
}

JNIEXPORT jfloat JNICALL
Java_org_lwjgl_nanovg_NanoVG_nnvgText(JNIEnv *env, jclass type, jlong ctx, jfloat x, jfloat y,
                                      jlong string, jlong end) {
    nvgText((NVGcontext *) ctx, x, y, (const char *) string, (const char *) end);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgStrokeColor__JJ(JNIEnv *env, jclass type, jlong ctx,
                                                NVGcolor color) {
    nvgStrokeColor((NVGcontext *) ctx, color);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgStrokeWidth(JNIEnv *env, jclass type, jlong ctx, jfloat size) {
    nvgStrokeWidth((NVGcontext *) ctx, size);
}

JNIEXPORT void JNICALL
Java_org_lwjgl_nanovg_NanoVG_nvgStroke(JNIEnv *env, jclass type, jlong ctx) {
    nvgStroke((NVGcontext *) ctx);
}

JNIEXPORT jlong JNICALL
Java_org_lwjgl_nanovg_NVGColor_address(JNIEnv *env, jclass type, jobject byteBuffer) {
    return (jlong) env->GetDirectBufferAddress(byteBuffer);
}

};