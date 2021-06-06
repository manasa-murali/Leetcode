fun main() {
    val toIntArray = arrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()
    val removeDuplicates = removeDuplicates2(toIntArray)
    for (i in 0 until removeDuplicates) {
        println(toIntArray[i])
    }

}

fun removeDuplicates2(nums: IntArray): Int {
    if (nums.size == 0) return 0
    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}
