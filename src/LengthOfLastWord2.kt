fun main() {
    val result = lengthOfLastWord2("Hello World ")
    println(result)

}

fun lengthOfLastWord2(s: String): Int {
    var count = 0
    if (s.isEmpty() || s.equals(" ")) {
        return 0
    }
    val newString = s.trim()
    for (i in newString.length - 1 downTo 0) {
        if (newString.toCharArray()[i] != ' ') {
            count++
        } else {
            return count
        }
    }
    return count
}
