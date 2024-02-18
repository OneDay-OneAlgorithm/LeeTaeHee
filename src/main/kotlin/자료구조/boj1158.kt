package 자료구조

import java.util.*

// 요세푸스 문제

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val queue = LinkedList<Int>()
    for (i in 1..n) queue.add(i)

    var result = "<"

    while (queue.size > 0) {
        repeat(k - 1) {
            queue.add(queue.poll())
        }

        result += "${queue.poll()}"

        if (queue.size == 0) break
        result += ", "
    }

    result += ">"
    bw.write(result)
    bw.flush()
    bw.close()
}