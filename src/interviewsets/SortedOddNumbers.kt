package interviewsets

fun main() {
    println(sortedOdds(intArrayOf(4, 2, 3, 1, 6, 5, 9, 6)))
}

fun sortedOdds(intArray: IntArray): List<Int> {

    val sortedOdds = intArray.filter {
        it % 2 == 1
    }.sortedBy {
        it
    }

    return sortedOdds
}
