package 구현

// 기적의 매매법

fun main(){
    val seed = readln().toInt()
    val stockList = readln().split(" ").map { it.toInt() }

    println(timing(seed, stockList))

}

fun bnp(seed : Int, list : List<Int>) : Int{
    var savings = seed
    var stockCount = 0

    for (i in list.indices) {
        if (list[i] <= savings) {
            stockCount = seed / list[i]
            savings = seed % list[i]
        }
    }

    return list[list.size - 1] * stockCount
}

fun timing(seed : Int, list: List<Int>): Int{
    var savings = seed
    var stockCount = 0

    for (i in 3 until list.size) {
        if (list[i-3] > list[i-2] && list[i-2] > list[i-1] && list[i-1] <= savings){
            val buyingStockCount = savings / list[i-1]
            stockCount += buyingStockCount
            savings -= list[i-1] * buyingStockCount
        }


        if (list[i-3] < list[i-2] && list[i-2] < list[i-1]){
            if (stockCount > 0) {
                val sellingStockCount = stockCount
                savings += sellingStockCount * list[i-1]
                stockCount = 0
            }
        }
    }

    savings += list.last() * stockCount
    return savings
}
