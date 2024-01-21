package 구현

// 과제 안 내신 분..?

fun main() {
    val arr = IntArray(30) { 0 }

    for (i in 1..28) {
        val num = readln().toInt()

        arr[num - 1] = 1
    }

    for (i in arr.indices) {
        if (arr[i] != 1) println("${i+1}")
    }
}