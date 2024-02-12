package 그리디

import java.util.*

// boj 17509

var timeSum = 0
var penalty = 0

fun main() {
    val problemArr = Array(11) { IntArray(2) }

    for (i in 0 until 11) {
        val input = readln().split(" ").map { it.toInt() }
        problemArr[i][0] = input[0]
        problemArr[i][1] = input[1]
    }

    Arrays.sort(problemArr) { o1, o2 ->
        o1[0] - o2[0]
    }

    for (i in 0 until 11) {
        timeSum += problemArr[i][0]
        penalty += (timeSum + 20 * problemArr[i][1])
    }

    println(penalty)
}