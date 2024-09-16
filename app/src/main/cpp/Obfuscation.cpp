#include <jni.h>
#include <string>

extern "C" JNIEXPORT void JNICALL
Java_io_adjoe_obfuscation_Obfuscation_a(JNIEnv *env, jobject /* this */, jobject views) {
    jclass listClass = env->FindClass("java/util/List");
    jmethodID sizeMID = env->GetMethodID(listClass, "size", "()I");
    jint size = env->CallIntMethod(views, sizeMID);
    if (size > 0) {
        jmethodID getMID = env->GetMethodID(listClass, "get", "(I)Ljava/lang/Object;");
        jobject firstView = env->CallObjectMethod(views, getMID, 0);
        jclass textViewClass = env->FindClass("android/widget/TextView");
        jmethodID setTextMID = env->GetMethodID(textViewClass, "setText", "(Ljava/lang/CharSequence;)V");
        env->CallVoidMethod(firstView, setTextMID, env->NewStringUTF("Hello World!"));
    }
}