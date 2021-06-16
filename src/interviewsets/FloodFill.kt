package interviewsets

fun main() {
    val image = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1), intArrayOf())
    println(floodFill(image, 1, 1, 1).contentToString())
}

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    //1 1 1
    //1 1 0
    //1 0 1

    val rowCount = image.size
    val columnCount = image[0].size
    if (image.isEmpty() || sr >= rowCount || sc >= columnCount || sr < 0 || sc < 0)
        return image
    if (image.isNotEmpty()) {
        image.forEach {
            if (it.isEmpty())
                return image
        }
    }
    val source = Pair<Int, Int>(sr, sc)
    val value = image[sr][sc]
    return fill(source, newColor, rowCount, columnCount, value, image)
}

fun fill(
    source: Pair<Int, Int>,
    newColor: Int,
    rowCount: Int,
    columnCount: Int,
    value: Int,
    image: Array<IntArray>
): Array<IntArray> {
    if (source.first >= rowCount || source.second >= columnCount || source.first < 0 || source.second < 0)
        return image
    else {
        if (image[source.first][source.second] == value) {
            image[source.first][source.second] = newColor

            val toprow = source.first - 1
            val topColumn = source.second
            fill(Pair(toprow, topColumn), newColor, rowCount, columnCount, value, image)

            val rightRow = source.first
            val rightColumn = source.second + 1
            fill(Pair(rightRow, rightColumn), newColor, rowCount, columnCount, value, image)

            val bottomRow = source.first + 1
            val bottomColumn = source.second
            fill(Pair(bottomRow, bottomColumn), newColor, rowCount, columnCount, value, image)

            val leftRow = source.first
            val leftColumn = source.second - 1
            fill(Pair(leftRow, leftColumn), newColor, rowCount, columnCount, value, image)
        }
    }
    return image
}