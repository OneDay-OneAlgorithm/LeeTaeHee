package DP

import kotlin.math.min

// boj 1463

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val numArr = Array(n + 1) { 100000 }

    numArr[1] = 0

    for (i in 1 until n) {
        numArr[i + 1] = min(numArr[i + 1], numArr[i] + 1)
        if (i * 2 <= n) numArr[i * 2] = min(numArr[i * 2], numArr[i] + 1)
        if (i * 3 <= n) numArr[i * 3] = min(numArr[i * 3], numArr[i] + 1)
    }

    bw.write(numArr[n].toString())
    bw.flush()
    bw.close()
}
