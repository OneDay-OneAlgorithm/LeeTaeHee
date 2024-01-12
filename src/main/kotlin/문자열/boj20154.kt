package 문자열

// 이 구역의 승자는 누구야?

fun main(){
    val str = readln()

    val strokes = mapOf('A' to 3, 'B' to 2, 'C' to 1, 'D' to 2, 'E' to 3, 'F' to 3, 'G' to 3, 'H' to 3, 'I' to 1, 'J' to 1, 'K' to 3, 'L' to 1, 'M' to 3, 'N' to 3, 'O' to 1, 'P' to 2, 'Q' to 2, 'R' to 2, 'S' to 1, 'T' to 2, 'U' to 1, 'V' to 1, 'W' to 2, 'X' to 2, 'Y' to 2, 'Z' to 1)
    val sum = str.sumOf { strokes[it]!! }

    if (sum % 2==0) println("You're the winner?") else println("I'm a winner!")
}