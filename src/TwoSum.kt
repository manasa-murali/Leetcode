object TwoSum {
    @JvmStatic
    fun main(args: Array<String>) {
        val twoSum = twoSum(arrayOf(2, -5, 2, -6).toIntArray(), -11)
        println(twoSum[0].toString() + "," + twoSum[1].toString())
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        var twoSum: IntArray = IntArray(2, { i -> -1 })

        nums.forEachIndexed { index, it ->
            hashMap[index] = target - it
        }

        hashMap.values.forEachIndexed { index, value ->
            if ((nums.indexOf(value) != index)&& nums.indexOf(value) !=-1) {
                twoSum[0] = Math.min(nums.indexOf(value), index)
                twoSum[1] = Math.max(nums.indexOf(value), index)
                return twoSum
            }
        }
        return twoSum
    }


}