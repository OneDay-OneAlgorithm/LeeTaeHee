package 문자열

// 경고

fun main() {
    val currentTime = readln().timeToSeconds()
    val throwTime = readln().timeToSeconds()

    val waitingTime = when {
        throwTime - currentTime <= 0 -> (throwTime + 24 * 3600 - currentTime).toTimeString()
        else -> (throwTime - currentTime).toTimeString()
    }

    println(waitingTime)


}

fun String.timeToSeconds(): Int {
    val (hour, minute, seconds) = this.split(":").map { it.toInt() }
    return hour * 3600 + minute * 60 + seconds
}

fun Int.toTimeString(): String {
    val hours = this / 3600
    val minutes = (this % 3600) / 60
    val seconds = this % 60

    return String.format("%02d:%02d:%02d", hours, minutes, seconds)
}


