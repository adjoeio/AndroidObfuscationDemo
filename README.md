# Android Obfuscation Demo

This project demonstrates the use of different obfuscation techniques in an Android project.

## Structure

The application itself doesn't do anything. The important part is the `app/src/main/java/io/adjoe/obfuscation/Obfuscation.kt` Kotlin class which contains two functions in three subclasses.
* The subclass `Plain` will never be obfuscated.
* The subclass `ProGuard` will be obfuscated only by [ProGuard](https://www.guardsquare.com/proguard).
* The subclass `OpenObfuscator` will be obfuscated only by [dProtect's OpenObfuscator](https://obfuscator.re/dprotect/introduction/).

There is also native code in `app/src/main/cpp/Obfuscation.cpp` which demonstrates the use of native code for obfuscation.

## Try it out

To see the effect of the different obfuscation mechanisms build the APK. You can find a Gradle run configuration for that under `runConfigurations/build app.run.xml`.

Once built you can inspect the APK under `app/build/outputs/apk/release/app-release-unsigned.apk`. Suggested ways of doing this:
* Use Android Studio's builtin byte code viewer.
* Unpack the `classes.dex` form the APK and then convert it to a JAR using for example [dex2jar](https://github.com/pxb1988/dex2jar). For viewing the contents of the JAR you can use for example Android Studio's builtin JAR viewer, [JD-GUI](https://java-decompiler.github.io/) or [Recaf](https://github.com/Col-E/Recaf).

For disassembling and decompiling the native library you will need a reverse engineering tool like [Ghidra](https://ghidra-sre.org/) or [Cutter](https://ghidra-sre.org/).

## More to read

Here are some sources that you can check out if you would like to learn more about obfuscation on Android:

* ProGuard's explanation of obfuscation: https://www.guardsquare.com/what-is-code-obfuscation
* Paper on obfuscation methods for Java programs: https://www.researchgate.net/publication/266502139_Methods_for_Obfuscating_Java_Programs/fulltext/54365a5b0cf2dc341db2ff59/Methods-for-Obfuscating-Java-Programs.pdf. Old but still very relevant.
* A comparison of different control flow obfuscation mechanisms: https://arxiv.org/pdf/1809.11037

And here is a list of obfuscators for Android (not complete, no recommendations):
* [Obfuscapk](https://github.com/ClaudiuGeorgiu/Obfuscapk) (*note: no longer maintained*)
* [BlackObfuscator](https://github.com/CodingGay/BlackObfuscator/blob/jar2dex-2.2/README_EN.md) (*note: no longer maintained*)
* [DexGuard](https://www.guardsquare.com/dexguard): the paid version of ProGuard with more capabilities
* [Allatori Android Obfuscator](https://allatori.com/features/android-obfuscation.html): paid, free trial version available
* [PreEmptive Protection DashO](https://www.preemptive.com/android-obfuscation/): paid, free trial version available