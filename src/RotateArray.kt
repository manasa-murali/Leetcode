fun main() {
    val arrayOf = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val rotateBy = 2
    val result = rotate(arrayOf.toIntArray(), rotateBy)
    println(result.contentToString())

}

fun rotate(array: IntArray, rotateBy: Int): IntArray {
    if (array.isEmpty() || array.size == rotateBy) {
        return array
    }
    val k = Math.floorMod(rotateBy, array.size)
    reverse(array, array.size - k, array.size - 1)
    reverse(array, 0, array.size - k - 1)
    reverse(array, 0, array.size - 1)
    return array
}

private fun reverse(array: IntArray, start: Int, end: Int) {
    var i = start
    var j = end
    while (i < j) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
        i++
        j--
    }
}
