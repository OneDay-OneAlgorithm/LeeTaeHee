package 자료구조

// 줄 세우기

fun main() {
    val n = readln().toInt()
    val students = ArrayList<Int>()
    students.add(-1)

    val numbers = readln().split(" ").map { it.toInt() }

    for (i in 1..n) students.add(i - numbers[i - 1], i)

    for (i in 1..n) print("${students[i]} ")
}