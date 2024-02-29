package 백트래킹

import kotlin.math.max

// boj 1987

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var max = 0
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(r) { CharArray(c) }

    for (i in 0 until r) {
        val input = br.readLine()
        for (j in 0 until c) {
            board[i][j] = input[j]
        }
    }

    val visited = BooleanArray(26)
    visited[board[0][0] - 'A'] = true

    fun dfs(startX: Int, startY: Int, depth: Int) {
        max = max(max, depth)
        repeat(4) {
            val nx = startX + dx[it]
            val ny = startY + dy[it]

            if (nx in 0 until r && ny in 0 until c) {
                val next = board[nx][ny] - 'A'
                if (!visited[next]) {
                    visited[next] = true
                    dfs(nx, ny, depth + 1)
                    visited[next] = false
                }
            }
        }

    }

    dfs(0, 0, 1)

    bw.write("$max")
    bw.flush()
    bw.close()

}
