package 브루트포스

fun main() {
    val caseCount = readln().toInt()

    repeat(caseCount) {
        println(checkCondition(readln().toInt()))
    }
}

fun checkCondition(num: Int): Int {
    var maxTriN = 0

    for (n in 1..num) {
        if (calculateTriNum(n) >= num) {
            maxTriN = n
            break
        }
    }

    for (i in 1..maxTriN) {
        for (j in i..maxTriN) {
            for (k in j..maxTriN) {
                if (calculateTriNum(i) + calculateTriNum(j) + calculateTriNum(k) == num) return 1
            }
        }
    }

    return 0

}

fun calculateTriNum(n: Int) = n * (n + 1) / 2