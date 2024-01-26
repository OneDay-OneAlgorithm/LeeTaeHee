package 자료구조

import java.util.*

// 줄 세우기

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val N = nextInt()
    val students = LinkedList<Int>()
    val numbers = IntArray(N)

    for(i in 0 until N) numbers[i] = nextInt()

    for(i in N-1 downTo 0) students.add(numbers[i], i+1)

    for(student in students) print("$student ")
}