fun main() {
    val twoSum = twoSum(arrayOf(2, 5, 2, 6).toIntArray(), 11)
    println(twoSum[0].toString() + "," + twoSum[1].toString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = HashMap<Int, Int>()
    var twoSum: IntArray = IntArray(2, { i -> -1 })

    nums.forEachIndexed { i, it ->
        if (hashMap.containsKey(target - it)) {
            twoSum[0] = hashMap.getValue(target - it)
            twoSum[1] = i
            return twoSum
        } else {
            hashMap[it] = i
        }

    }
    return twoSum
}
