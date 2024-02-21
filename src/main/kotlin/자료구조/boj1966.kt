package 자료구조

import java.util.*

// 프린터큐

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()


    val testCaseCount = br.readLine().toInt()

    repeat(testCaseCount) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var count = 0
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        br.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, priority ->
            queue.offer(Pair(index, priority))
        }

        while (queue.size >= 0) {
            val current = queue.poll()

            if (queue.any { it.second > current.second }) {
                queue.offer(current)
            } else {
                count++
                if (current.first == m) {
                    bw.write("$count\n")
                    break
                }
            }
        }

    }

    bw.flush()
    bw.close()
}