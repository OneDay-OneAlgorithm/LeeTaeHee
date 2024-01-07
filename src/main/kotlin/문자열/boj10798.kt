package 문자열

import java.lang.StringBuilder

// 세로읽기

fun main() {
    val words = Array(5) { readln().toCharArray() }
    val maxSize = words.maxOf { it.size }

    val result = StringBuilder().apply {
        for (i in 0 until maxSize) {
            for (j in 0 until 5) {
                if (i < words[j].size) append(words[j][i])
            }
        }
    }

    println(result.toString())
}