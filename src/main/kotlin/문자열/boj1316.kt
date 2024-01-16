package 문자열

// 그룹 단어 체커

var correctNum = 0

fun main(){
    val wordNum = readln().toInt()

    repeat(wordNum){
        checkGroupWord(readln())
    }

    println(correctNum)
}

fun checkGroupWord(str : String){
    var list = ArrayList<Char>()
    var check = true

    list.add(str[0])
    for (index in str.indices){
        if (list[list.size - 1] != str[index]) {
            if (list.contains(str[index])){
                check = false
                break
            } else list.add(str[index])
        }
    }

    if (check) correctNum++
}