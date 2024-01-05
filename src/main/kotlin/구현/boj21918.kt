package 구현

// boj21918 전구

fun main() {

    val (lightBulbCount, orderCount) = readln().split(" ").map { it.toInt() }
    val bulbArray = readln().split(" ").toMutableList().map { it.toInt() }.toMutableList()

    for (i in 1..orderCount) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }

        when (a) {
            1 -> {
                bulbArray[b - 1] = c
            }

            2 -> {
                for (j in b - 1 until c) changeBulbState(bulbArray, j)
            }

            3 -> {
                for (j in b - 1 until c) lightOff(bulbArray, j)
            }

            4 -> {
                for (j in b - 1 until c) lightOn(bulbArray, j)
            }
        }
    }

    for (i in 0 until lightBulbCount) print("${bulbArray[i]} ")

}

fun changeBulbState(bulbList: MutableList<Int>, index: Int) {
    val originBulbState = bulbList[index]

    bulbList[index] = if (originBulbState == 0) 1 else 0
}

fun lightOff(bulbList: MutableList<Int>, index: Int) {
    bulbList[index] = 0
}

fun lightOn(bulbList: MutableList<Int>, index: Int) {
    bulbList[index] = 1
}