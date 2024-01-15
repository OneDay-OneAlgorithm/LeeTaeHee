package 수학

// LCM

fun main() {
    val testCase = readln().toInt()

    repeat(testCase) {
        val (a, b) = readln().split(" ").map { it.toLong() }
        println(calculateLcm(a, b))
    }
}

fun calculateLcm(numberA: Long, numberB: Long) : Long = numberA * numberB / calculateGcd(numberA, numberB)

fun calculateGcd(numberA: Long, numberB: Long): Long {
    if (numberB == 0L) return numberA
    return calculateGcd(numberB, numberA % numberB)
}