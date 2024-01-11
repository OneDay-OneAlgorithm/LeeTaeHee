package 구현

// 기적의 매매법

fun main() {
    val seed = readln().toInt()
    val stockList = readln().split(" ").map { it.toInt() }

    val bnpBudget = bnp(seed, stockList)
    val timingBudget = timing(seed, stockList)

    if (bnpBudget > timingBudget) println("BNP")
    else if (bnpBudget < timingBudget) println("TIMING")
    else println("SAMESAME")

}

fun bnp(seed: Int, list: List<Int>): Int {
    var savings = seed
    var stockCount = 0

    for (i in list.indices) {
        if (list[i] <= savings) {
            stockCount += savings / list[i]
            savings -= stockCount * list[i]
        }
    }

    return savings + list.last() * stockCount
}

fun timing(seed: Int, list: List<Int>): Int {
    var savings = seed
    var stockCount = 0
    var upCount = 0
    var downCount = 0

    for (i in 1 until list.size) {
        val presentStock = list[i]
        val pastStock = list[i - 1]

        when {
            presentStock > pastStock -> {
                upCount++
                downCount = 0
            }

            presentStock < pastStock -> {
                upCount = 0
                downCount++
            }

            else -> {
                upCount = 0
                downCount = 0
            }
        }

        if (downCount >= 3) {
            if (savings >= presentStock) {
                val count = savings / presentStock
                savings -= count * presentStock
                stockCount += count
            }
        }

        if (upCount >= 3 || i == list.size - 1) {
            savings += stockCount * presentStock
            upCount = 0
            stockCount = 0
        }

    }

    return savings
}
