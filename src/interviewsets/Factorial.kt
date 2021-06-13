package interviewsets

fun main() {
    var factorial = 1
    println(findFactorial(0, factorial))
}

fun findFactorial(num: Int, factorial: Int): Int {
    if (num == 0 || num == 1) {
        return factorial
    }
    return findFactorial(num - 1, factorial * num)
}
