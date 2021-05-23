object RemoveDuplicates {
    @JvmStatic
    fun main(args:Array<String>){
        val removeDuplicates = removeDuplicates(arrayOf(2, 2, 5, 6).toIntArray())
        println(""+removeDuplicates)

    }
    fun removeDuplicates(nums: IntArray): Int {
        val mutableList = nums.toMutableList()
        var i = 0
        if (nums.size == 1){
            return nums.size
        }else {
            while (i < mutableList.size-1) {
                if (mutableList[i]!= mutableList[i+1]){
                    i++
                }else{
                    mutableList.removeAt(i)
                }
            }
            return mutableList.size
        }
    }

}