package 브루트포스

// 일곱난쟁이

fun main() {
    val heightArr: Array<Int> = Array(9) { readln().toInt() }
    var sum = heightArr.sum()

    for (i in 0 until 8) {
        for (j in i + 1 until 9) {
            if (sum - heightArr[i] - heightArr[j] == 100) {
                heightArr[i] = 0
                heightArr[j] = 0

                heightArr.sort()

                for (k in 2 until 9) println(heightArr[k])
                return
            }
        }
    }
}