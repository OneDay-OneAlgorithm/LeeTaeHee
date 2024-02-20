package 자료구조

import java.util.Stack

// 괄호

val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()

fun main() {

    val testCastCount = br.readLine().toInt()

    repeat(testCastCount) {
        checkCorrectVPS()
    }

    bw.flush()
    bw.close()
}

fun checkCorrectVPS() {
    val input = br.readLine().toCharArray()

    val stack = Stack<Char>()

    for (i in input.indices) {
        if (input[i] == '(') {
            stack.push(input[i])
        } else {
            if (stack.size == 0) {
                bw.write("NO\n")
                return
            } else {
                stack.pop()
            }
        }
    }

    if (stack.size == 0) bw.write("YES\n") else bw.write("NO\n")

}