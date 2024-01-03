package 수학

fun main() {
    val m = readln().toInt()
    val n = readln().toInt()

    printSumAndMin(m, n)
}

private fun printSumAndMin(m: Int, n: Int) {
    var primeSum = 0
    var min = 0
    val arr = Array(n + 1) { true }
    arr[0] = false
    arr[1] = false

    checkPrimeNumbers(n, arr)

    for (i in n downTo m) {
        if (arr[i]) {
            primeSum += i
            min = i
        }
    }

    if (min == 0) println(-1) else {
        println(primeSum)
        println(min)
    }
}

private fun checkPrimeNumbers(num: Int, arr: Array<Boolean>) {
    for (i in 2..num) {
        if (arr[i]) {
            for (j in (2 * i)..num step i) arr[j] = false
        }
    }
}