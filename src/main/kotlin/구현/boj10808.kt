package 구현

// 알파벳 개수

fun main() {
    val bw = System.out.bufferedWriter()

    val str = readln()
    val arr = arrayOf(
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j',
        'k',
        'l',
        'm',
        'n',
        'o',
        'p',
        'q',
        'r',
        's',
        't',
        'u',
        'v',
        'w',
        'x',
        'y',
        'z'
    )

    val resultArr = Array(26) { 0 }

    for (i in str) {
        resultArr[arr.indexOf(i)] += 1
    }

    for (j in 0 until 26){
        bw.write("${resultArr[j]} ")
    }

    bw.flush()
    bw.close()

}