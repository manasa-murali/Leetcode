fun main() {
    println(singleNumber(intArrayOf(2, 4, 3, 3, 2, 1, 1)))
}

fun singleNumber(nums: IntArray): Int {
    var singleNumber: Int = nums[0]
    for (i in 1 until nums.size) {
        singleNumber=singleNumber.xor(nums[i])
    }
    return singleNumber
}