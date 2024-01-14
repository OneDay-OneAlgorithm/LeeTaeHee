package 수학

// 소인수분해

fun main(){
    val n = readln().toInt()

    factorization(n)
}

private fun  factorization(num : Int){
    var number = num
    var i = 2

    while (true){
        if (number % i == 0) {
            println(i)
            number /= i
            i = 2
        } else if (number == 1) break
        else i++
    }
}