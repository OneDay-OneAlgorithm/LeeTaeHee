package 문자열

// 복호화

fun main() {
    var testCase = readln().toInt()

    repeat(testCase) {
        val str = readln().replace(" ", "")
        val frequency = str.groupingBy { it }.eachCount()
        val max = frequency.values.maxOrNull()
        val maxChar = frequency.filter { it.value == max }.keys
        println(if (maxChar.size > 1) "?" else maxChar.first())
    }
}
