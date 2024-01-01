package 구현

fun main() {
    val observeNumber = readln().toInt()

    val cowArr = Array(11) { IntArray(1) { -1 } }
    var cowSum = 0

    for (i in 0 until observeNumber) {
        val (cowNum, cowLocate) = readln().split(" ").map { it.toInt() }

        if (cowArr[cowNum][0] == -1) {
            cowArr[cowNum][0] = cowLocate
        } else {
            if (cowArr[cowNum][0] != cowLocate) {
                cowSum++
                cowArr[cowNum][0] = cowLocate
            }
        }
    }

    println(cowSum)
}