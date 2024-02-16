package 이분탐색

// 예산

val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
val requests = br.readLine().split(" ").map { it.toInt() }.toIntArray()

fun main() {
    val maxBudget = br.readLine().toInt()

    var start = 0
    var end = requests.max()
    var result = 0

    while (start <= end) {
        val mid = (start + end) / 2

        if (calculateBudget(mid) > maxBudget) {
            end = mid - 1
        } else {
            start = mid + 1
            result = mid
        }

    }

    bw.write(result.toString())
    bw.flush()
    bw.close()

}

fun calculateBudget(budget: Int): Long {
    var totalBudget = 0L
    for (i in 0 until n) {
        totalBudget += if (budget > requests[i]) {
            requests[i].toLong()
        } else {
            budget.toLong()
        }
    }
    return totalBudget
}