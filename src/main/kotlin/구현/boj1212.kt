package 구현

// 8진수 2진수

fun main(){
    val parser = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")

    val num8 = readln()

    if (num8 == "0") {
        println(0)
        return
    }

    val sb = StringBuilder()

    for (c in num8) {
        sb.append(parser[c.digitToInt()])
    }

    // 시작부분 0 제거
    println(sb.trimStart { it == '0' })
}