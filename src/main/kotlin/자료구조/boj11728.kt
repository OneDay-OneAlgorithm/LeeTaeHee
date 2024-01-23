package 자료구조

// 배열 합치기

fun main() {
    val bw = System.out.bufferedWriter()

    val (sizeOfArrA, sizeOfArrB) = readln().split(" ").map { it.toInt() }

    val arr1 = readln().split(" ").map { it.toInt() }.toIntArray()
    val arr2 = readln().split(" ").map { it.toInt() }.toIntArray()

    var i = 0
    var j = 0

    while (i < sizeOfArrA && j < sizeOfArrB) {
        if (arr1[i] <= arr2[j]) bw.write("${arr1[i++]} ")
        else bw.write("${arr2[j++]} ")
    }

    while (i < sizeOfArrA) bw.write("${arr1[i++]} ")
    while (j < sizeOfArrB) bw.write("${arr2[j++]} ")

    bw.flush()
    bw.close()
}