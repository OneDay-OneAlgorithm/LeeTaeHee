package BFS

import java.util.*

// 미로 탐색

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val maze = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        val input = br.readLine()
        for (j in 0 until m) {
            maze[i][j] = input[j] - '0'
        }
    }

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, 1, -1, 0)
    queue.offer(Pair(0, 0))

    val dist = Array(n) { IntArray(m) { 0 } }
    var count = 1
    var breakPoint = true
    maze[0][0] = 0

    while (breakPoint) {
        val front = queue.poll()
        repeat(4) {
            val x = front.first + dx[it]
            val y = front.second + dy[it]

            if (x in 0 until n && y in 0 until m) {
                if (maze[x][y] == 1) {
                    dist[x][y] = dist[front.first][front.second] + 1
                    maze[x][y] = 0
                    queue.offer(Pair(x, y))
                }
                if (x == n - 1 && y == m - 1) {
                    bw.write((dist[x][y] + 1).toString())
                    breakPoint = false
                }
            }
        }
    }

    bw.flush()
    bw.close()


}