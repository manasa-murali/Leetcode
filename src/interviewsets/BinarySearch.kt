package interviewsets

fun main() {

    println(binarySearch(intArrayOf(1, 3, 5, 6, 9, 10), 7))
}

fun binarySearch(intArray: IntArray, num: Int): Int {
    return search(intArray, left = 0, right = intArray.size - 1, num)
}

fun search(intArray: IntArray, left: Int, right: Int, num: Int): Int {
    if (left > right) {
        return -1
    }
    val midPoint = (left + right) / 2
    if (intArray[midPoint] == num) {
        return midPoint
    } else if (intArray[midPoint] < num) {
        search(intArray, left, right = midPoint - 1, num)
    } else {
        search(intArray, left + 1, right, num)
    }
    return -1
}
