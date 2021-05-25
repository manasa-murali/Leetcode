object SearchInsertPosition {
    @JvmStatic
    fun main(args: Array<String>) {
        val index = insertIndex(arrayOf(1, 3,5,6).toIntArray(), 7)
        println(index)
    }

    fun insertIndex(array: IntArray, target: Int): Int {
        return binarySearch(array, target, 0, array.size - 1)
    }

    fun binarySearch(array: IntArray, target: Int, low: Int, high: Int): Int {
        val midPoint = (low + high) / 2
        if (high < low) {
            return low
        }
        if (array[midPoint] == target) {
            return midPoint
        } else if (high - low == 1) {
            if (target<array[high] && target>array[low]){
                return high
            }else if (target<array[low]){
                return low
            }else if (target>array[high]){
                return high+1
            }else{
                return high
            }
        } else if (target > array[midPoint]) {
            return binarySearch(array, target, midPoint + 1, high)
        } else {
            return binarySearch(array, target, low, midPoint - 1)
        }

    }


}