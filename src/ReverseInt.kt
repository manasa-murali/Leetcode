import java.util.*

object ReverseInt {
    @JvmStatic
    fun main(args: Array<String>) {
        val reverse = reverse(1534236469)
        println(reverse)
    }


    fun reverse(x: Int): Int {
        var num = x
        var result: Int = 0
        val stack = Stack<Int>()
        while (num != 0) {
            stack.push(num % 10)
            num = num / 10
        }
        stack.forEachIndexed { index, it ->
            result = result + (it * Math.pow((10.toDouble()), (stack.size - 1 - index).toDouble())).toInt()
        }

        if (isOpposite(x, result)) {
            return 0
        } else {
            return result
        }

    }

    private fun isOpposite(x: Int, result: Int): Boolean {
        return x.sign != result.sign
    }

    public val Int.sign: Int
        get() = when {
            this < 0 -> -1
            this > 0 -> 1
            else -> 0
        }
}
