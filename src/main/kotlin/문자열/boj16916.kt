package 문자열

// boj16916 부분 문자열

fun main() {
    val s = readln()
    val p = readln()

    if (kmp(s, p)) println(1) else print(0)
}

fun getPiTable(p: String): IntArray {
    val m = p.length
    val piTable = IntArray(m)
    var j = 0

    for (i in 1 until m) {
        while (j > 0 && p[i] != p[j]) j = piTable[j - 1]
        if (p[i] == p[j]) piTable[i] = ++j
    }

    return piTable
}

fun kmp(s: String, p: String): Boolean {
    val piTable = getPiTable(p)
    var j = 0

    for (i in s.indices) {
        while (j > 0 && s[i] != p[j]) j = piTable[j - 1]
        if (s[i] == p[j]) if (j == p.length - 1) return true else j++
    }
    return false
}