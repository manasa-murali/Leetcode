fun main() {
    val reverseString = reverseString(charArrayOf())
}

fun reverseString(s: CharArray): Int {
    var i = 0
    var j = s.size - 1
    while (i <= j) {
        val temp = s[i]
        s[i] = s[j]
        s[j] = temp
        i++
        j--
    }
    return s.size
}
