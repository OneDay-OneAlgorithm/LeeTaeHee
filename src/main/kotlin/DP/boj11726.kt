package DP

// 2 x n 타일링

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { 0 }
    dp[1] = 1
    dp[2] = 2

    when (n){
        1 -> {
            bw.write(1)
            bw.flush()
            bw.close()
            return
        }
        2 -> {
            bw.write(2)
            bw.flush()
            bw.close()
            return
        }
    }

    for (i in 3..n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
    }

    bw.write((dp[n]).toString())
    bw.flush()
    bw.close()
}
