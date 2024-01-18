package 문자열

// 나는 친구가 적다 (Small)

fun main(){
    val k = readln().replace("[0-9]".toRegex(), "")
    findKeyword(k, readln())
}

fun findKeyword(str : String, keyword: String){
    if (str.contains(keyword)) println(1) else println(0)
}