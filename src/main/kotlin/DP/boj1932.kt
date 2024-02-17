package DP

import kotlin.math.max

// 정수 삼각형

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val triArr = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    val dp = Array(n) { IntArray(n) }

    dp[0][0] = triArr[0][0]

    for (i in 1 until n) {
        dp[i][0] += triArr[i][0] + dp[i - 1][0]
        dp[i][i] += triArr[i][i] + dp[i - 1][i - 1]
    }

    for (i in 2 until n) {
        for (j in 1 until i) {
            dp[i][j] = triArr[i][j] + max(dp[i - 1][j - 1], dp[i - 1][j])
        }
    }

    bw.write(dp[n - 1].max().toString())
    bw.flush()
    bw.close()

}