fun main() {
    println(majorityElement(intArrayOf(3, 2, 4, 4, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size / 2]
}
