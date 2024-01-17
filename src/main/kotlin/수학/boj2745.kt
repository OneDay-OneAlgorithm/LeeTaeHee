package 수학

import kotlin.math.pow

// 진법 변환

fun main(){
    val (N, B) = readln().split(" ")

    var sum:Long = 0
    for ((j, i) in (N.length - 1 downTo 0).withIndex()) {
        var c = N[j]
        var ascii = 0

        ascii = if(c in '0'..'9') {
            c-'0'
        } else {
            c-(55.toChar())
        }
        sum += ascii * (B.toDouble().pow(i.toDouble())).toLong()

    }
    print(sum)

}