package io.adjoe.obfuscation

import android.widget.TextView

class Obfuscation {
    external fun a(l: List<TextView>)

    /*
     Methods in this class won't be obfuscated.
     This makes it easier to compare the obfuscated methods and see the effect of the obfuscation.
     */
    class Plain {
        fun setFirstText(views: List<TextView>) {
            views.takeIf { it.isNotEmpty() }
                ?.run { get(0).text = "Hello World!" }
        }

        fun average(numbers: List<Int>): Double {
            return numbers.sum().toDouble() / numbers.size
        }

        fun fibonacci(num: Int): Int {
            var a = 0
            var b = 1
            var tmp: Int
            for (i in 2..num) {
                tmp = a + b
                a = b
                b = tmp
            }
            return b
        }
    }

    /*
     Methods in this class are obfuscated only with ProGuard.
     */
    class ProGuard {
        fun setFirstText(views: List<TextView>) {
            views.takeIf { it.isNotEmpty() }
                ?.run { get(0).text = "Hello World!" }
        }

        fun average(numbers: List<Int>): Double {
            return numbers.sum().toDouble() / numbers.size
        }

        fun fibonacci(num: Int): Int {
            var a = 0
            var b = 1
            var tmp: Int
            for (i in 2..num) {
                tmp = a + b
                a = b
                b = tmp
            }
            return b
        }
    }

    /*
 Methods in this class are obfuscated only with OpenObfuscator.
 */
    class OpenObfuscator {
        fun setFirstText(views: List<TextView>) {
            views.takeIf { it.isNotEmpty() }
                ?.run { get(0).text = "Hello World!" }
        }

        fun average(numbers: List<Int>): Double {
            return numbers.sum().toDouble() / numbers.size
        }

        fun fibonacci(num: Int): Int {
            var a = 0
            var b = 1
            var tmp: Int
            for (i in 2..num) {
                tmp = a + b
                a = b
                b = tmp
            }
            return b
        }
    }

}