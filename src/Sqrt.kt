fun main() {
    println(mySqrt(5))
}

fun mySqrt(s: Int): Int {
    return calculate(1L, s.toLong(), s.toLong()).toInt()
}

private fun calculate(min: Long, max: Long, num: Long): Long {
    if (num == 0L) {
        return 0
    }
    if (min >= max) {
        return min
    } else {
        val mid = (min + max) / 2
        if (min * min == num) {
            return min
        } else if (max * max == num) {
            return max
        } else if (mid * mid == num) {
            return mid
        } else if (mid * mid > num) {
            return calculate(min, mid - 1, num)
        } else {
            if (max * max < num) {
                return max
            } else {
                return calculate(mid, max - 1, num)
            }
        }
    }
}

