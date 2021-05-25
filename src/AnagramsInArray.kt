object AnagramsInArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val result = getAnagramCount(arrayOf("", ""))
        println(result)

    }

    private fun getAnagramCount(array: Array<String>): Int {
        var distinctHash = HashMap<HashMap<Char, Int>, Int>()
        for (i in array.indices) {
            val current = getAnagramHashTable(array[i])
            if (!distinctHash.contains(current)) {
                distinctHash[current] = 1
            } else {
                distinctHash[current] = distinctHash.getValue(current) + 1
            }
        }
        var count = 0
        distinctHash.forEach { entry ->
            if (entry.value > 1) {
                count++
            }
        }
        return count
    }

    private fun getAnagramHashTable(s: String): HashMap<Char, Int> {
        val hashMap = HashMap<Char, Int>()
        for (c in s) {
            if (hashMap.containsKey(c)) {
                hashMap[c] = hashMap.getValue(c) + 1
            } else {
                hashMap[c] = 1
            }
        }
        return hashMap
    }

}