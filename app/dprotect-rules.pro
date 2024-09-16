-keep class io.adjoe.obfuscation.Obfuscation$Plain { *; }
-keep class io.adjoe.obfuscation.Obfuscation$ProGuard { *; }
-keep,allowobfuscation class io.adjoe.obfuscation.Obfuscation$OpenObfuscator { *; }

-obfuscate-arithmetic,low class io.adjoe.obfuscation.** { *; }

-obfuscate-constants class io.adjoe.obfuscation.** { *; }

-obfuscate-control-flow class io.adjoe.obfuscation.** { *; }

-obfuscate-strings class io.adjoe.obfuscation.** { *; }