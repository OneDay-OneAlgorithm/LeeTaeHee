package 자료구조

import java.util.*

// 줄 세우기

fun main() {
    val n = readln().toInt()
    val students = LinkedList<Int>()
    val numbers = readln().split(" ").map { it.toInt() }

    for (i in n - 1 downTo 0) students.add(numbers[i], i + 1)

    for (student in students) print("$student ")
}