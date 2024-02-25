package BFS

import java.util.*

// boj 4179

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 0, 0, 1)
    val dy = intArrayOf(0, -1, 1, 0)

    val (r, c) = br.readLine().split(" ").map { it.toInt() }

    val jihun: Queue<Pair<Int, Int>> = LinkedList()
    val fire: Queue<Pair<Int, Int>> = LinkedList()
    val maze = Array(r) { CharArray(c) { ' ' } }
    var count = 0

    for (i in 0 until r) {
        val input = br.readLine()
        for (j in 0 until c) {
            maze[i][j] = input[j]
            if (maze[i][j] == 'J') {
                jihun.offer(Pair(i, j))
            } else if (maze[i][j] == 'F') {
                fire.offer(Pair(i, j))
            }
        }
    }


    while (true) {
        val prevJihunSize = jihun.size
        val prevFireSize = fire.size

        for (i in 0 until prevFireSize) {
            val (x, y) = fire.poll()
            for (j in 0 until 4) {
                val nx = x + dx[j]
                val ny = y + dy[j]
                if (nx in 0 until r && ny in 0 until c && maze[nx][ny] != '#' && maze[nx][ny] != 'F') {
                    maze[nx][ny] = 'F'
                    fire.offer(Pair(nx, ny))
                }
            }
        }

        for (i in 0 until prevJihunSize) {
            val (x, y) = jihun.poll()
            for (j in 0 until 4) {
                val nx = x + dx[j]
                val ny = y + dy[j]
                if (nx !in 0 until r || ny !in 0 until c) {
                    bw.write((count + 1).toString())
                    bw.flush()
                    bw.close()
                    return
                }
                if (maze[nx][ny] == '.') {
                    maze[nx][ny] = 'J'
                    jihun.offer(Pair(nx, ny))
                }
            }
        }

        if (jihun.isEmpty()) {
            bw.write("IMPOSSIBLE")
            bw.flush()
            bw.close()
            return
        }

        count++
    }

}