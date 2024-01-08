package 수학

// 공약수

fun main() {
    val numberCount = readln().toInt()

    val numbers = readln().split(" ").map { it.toInt() }
    var num = numbers[0]

    for (i in 1 until numberCount) {
        num = gcd(num, numbers[i])
    }

    for (i in 1..num) {
        if (num % i == 0) {
            println(i)
        }
    }


}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)