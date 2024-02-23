package DFS

// 유기농 배추

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val testCaseCount = br.readLine().toInt()

    repeat(testCaseCount) {
        val input = br.readLine().split(" ")
        val m = input[0].toInt()
        val n = input[1].toInt()
        val k = input[2].toInt()

        val field = Array(n) { IntArray(m) { 0 } }
        val stack = Stack<Pair<Int, Int>>()
        var count = 0

        // 배추 심기
        repeat(k) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            field[y][x] = 1
        }

        fun dfs(x: Int, y: Int) {
            field[x][y] = 0
            repeat(4) {
                val nx = x + dx[it]
                val ny = y + dy[it]
                if (nx in 0 until n && ny in 0 until m) {
                    if (field[nx][ny] == 1) {
                        stack.pop()
                        field[nx][ny] = 0
                        stack.push(Pair(nx, ny))
                        dfs(nx, ny)
                    }
                }
            }

        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (field[i][j] == 1) {
                    stack.push(Pair(i, j))
                    dfs(i, j)
                    count++
                }
            }
        }

        bw.write("$count\n")
    }

    bw.flush()
    bw.close()

}