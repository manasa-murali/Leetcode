object FactorialTrailingZeroes {
    @JvmStatic
    fun main(args: Array<String>) {
        val result = trailingZeroes(30)
        println(result)
    }

    fun trailingZeroes(n: Int): Int {
        return findZeroCount(n)
    }

    private fun findZeroCount(num: Int): Int {
        if (num == 0) return 0 else return (num / 5 + findZeroCount(num / 5))
    }
}