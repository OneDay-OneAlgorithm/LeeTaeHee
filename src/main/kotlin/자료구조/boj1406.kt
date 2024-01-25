package 자료구조

// 에디터, 연결리스트

fun main() {
    val bw = System.out.bufferedWriter()
    var strLinkedList = ArrayList<Char>()
    readln().forEach { strLinkedList.add(it) }

    val orderCount = readln().toInt()
    var cursor = strLinkedList.size

    repeat(orderCount) {
        val command = readln().split(" ")
        when (command[0]) {
            "L" -> {
                if (cursor != 0) cursor--
            }

            "D" -> {
                if (cursor != strLinkedList.size) cursor++
            }

            "B" -> {
                if (cursor != 0) strLinkedList.removeAt(--cursor)
            }

            "P" -> {
                strLinkedList.add(cursor, command[1][0])
                cursor++
            }
        }
    }

    for (i in strLinkedList) bw.write(i.toString())
    bw.flush()
    bw.close()

}
