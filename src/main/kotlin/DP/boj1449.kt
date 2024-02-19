package DP

//

fun main() {
    val (n, tapeLength) = readln().split(" ").map { it.toInt() }
    var tapeCount = 0
    val arr = readln().split(" ").map { it.toInt() }.toIntArray()
    var tapeLimit = 0.0

    arr.sort()

    for (i in 0 until n) {
        if (arr[i] > tapeLimit) {
            tapeCount++
            tapeLimit = arr[i] + tapeLength - 0.5
        }
    }

    println(tapeCount)
}