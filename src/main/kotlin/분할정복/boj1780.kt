package 분할정복

// boj 1780
val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()
val totalPaperCount = br.readLine().toInt()
val paperArr = Array(totalPaperCount) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

/*
index 0 이 -1의 개수, 1이 0의 개수, 2가 1의 개수
 */
val resultArr = Array(3) { 0 }


fun main() {
    checkPaper(totalPaperCount, 0, 0)

    bw.write("${resultArr[0]} \n${resultArr[1]} \n${resultArr[2]}")
    bw.flush()
    bw.close()

}

fun checkPaper(paperSize: Int, rowStartIndex: Int, colStartIndex: Int) {
    val firstNum = paperArr[rowStartIndex][colStartIndex]

    if (paperSize == 1) {
        resultArr[firstNum + 1] += 1
        return
    }

    for (i in rowStartIndex until rowStartIndex + paperSize) {
        for (j in colStartIndex until colStartIndex + paperSize) {
            if (paperArr[i][j] != firstNum) {
                cropPaper(paperSize, rowStartIndex, colStartIndex)
                return
            }
        }
    }

    resultArr[firstNum + 1] += 1
}

fun cropPaper(paperSize: Int, rowStartIndex: Int, colStartIndex: Int) {
    val cropTargetSize = paperSize / 3
    for (i in 0..2) {
        for (j in 0..2) {
            checkPaper(
                cropTargetSize,
                rowStartIndex + cropTargetSize * i,
                colStartIndex + cropTargetSize * j
            )
        }
    }
}