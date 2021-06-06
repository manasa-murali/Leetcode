fun main() {
    val toIntArray = arrayOf(3, 2, 2, 3).toIntArray()
    val removeDuplicates = removeElement(toIntArray, 3)
    for (i in 0 until removeDuplicates) {
        println(toIntArray[i])
    }

}

fun removeElement(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var i = 0

    for (j in nums.indices) {
        if (nums[j] != target) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}


