fun main() {
    println(maxSubArray(arrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4).toIntArray()))
}

fun maxSubArray(nums: IntArray): Int {
    var ans = 0
    var sum = 0
    var isNegative = true
    for (i in nums.indices) {
        if (nums[i] < 0 && isNegative) {
            ans = if (i == 0) nums[i] else Math.max(ans, nums[i])
        } else {
            isNegative = false
            ans = 0
            break
        }
    }
    if (isNegative) {
        return ans
    }
    for (i in nums.indices) {
        if (sum + nums[i] > 0) {
            sum += nums[i]
        } else {
            sum = 0
        }
        ans = Math.max(ans, sum)
    }
    return ans
}
