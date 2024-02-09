package 브루트포스

// 부분 수열의 합

val firstLine = kotlin.io.readln().split(" ").map { it.toInt() }
val targetNum = firstLine[1]
var ans = 0
var currentNum = 0

val totalArr = readln().split(" ").map { it.toInt() }.toIntArray()

fun main() {

    for (depth in 1..totalArr.size) {
        combination(0, depth, 0)
    }

    println(ans)
}

/**
 * count는 현재 뽑은 개수, depth는 총 뽑을 개수를 의미
 *
 * 조합은 순서를 고려하지 않기 때문에 방문 처리를 해주지 않아도 됨
 * beginWith로 탐색을 시작할 위치를 정함
 */
fun combination(count: Int, depth: Int, beginIndex: Int) {

    /*
    현재 뽑은 개수가 뎁스와 같다면 결과를 비교
     */
    if (count == depth) {
        if (currentNum == targetNum) ans++
        return
    }

    /*
    재귀방식을 통해 아이템을 추가하고 제거하여 카운트 내의 경우를 모두 확인함
     */
    for (currentIndex in beginIndex until totalArr.size) {
        currentNum += totalArr[currentIndex]
        combination(count + 1, depth, currentIndex + 1)
        currentNum -= totalArr[currentIndex]
    }

}