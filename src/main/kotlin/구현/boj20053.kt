package 구현

import java.util.StringTokenizer

// 최소, 최대 2

fun main() = with(System.`in`.bufferedReader()) {
    val caseCount = readLine().toInt()

    for (i in 1..caseCount) {
        val numberCount = readLine().toInt()

        val st = StringTokenizer(readLine())
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (j in 0 until numberCount) {
            val num = st.nextToken().toInt()

            if (num < min) min = num
            if (num > max) max = num
        }

        println("$min $max")
    }
}