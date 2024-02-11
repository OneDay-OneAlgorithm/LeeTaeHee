package 그리디

import java.util.*

// boj 1931

fun main() {
    val n = readln().toInt()
    var count = 0
    var endTime = 0

    val time = Array(n) { IntArray(2) }

    // 입력
    for (i in 0 until n) {
        val input = readln().split(" ").map { it.toInt() }
        time[i][0] = input[0]
        time[i][1] = input[1]
    }

    /*
    두 회의의 종료 시간이 같다면, 시작 순서가 빠른 순서대로 정룔
    그게 아니라면, 종료 시간이 빠른 순서대로 정렬
     */
    Arrays.sort(time) { o1, o2 ->
        if (o1[1] == o2[1]) {
            o1[0] - o2[0]
        } else o1[1] - o2[1]
    }

    /*
    종료된 회의의 시간이 다음 회의 시작보다 빠르다면,
    그 회의를 채택하고 그 회의의 종료 시간을 저장한다.
    이미 종료시간이 빠른 순서대로 저장되었기에, 겹치지 않고 회의 종료 시간이 빠른 것을 채택하도록 한다.
     */
    for (i in 0 until n) {
        if (endTime <= time[i][0]) {
            endTime = time[i][1]
            count++
        }
    }

    println(count)
}