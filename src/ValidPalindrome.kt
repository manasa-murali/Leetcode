fun main() {
    println(isPalindrome("0P"))
}


fun isPalindrome(s: String): Boolean {
    val lowerCaseString = s.toLowerCase()
    val regex = "^[a-z0-9]+$".toRegex()
    val withoutSpace = lowerCaseString.replace("\\s".toRegex(), "")
    var duplicate = StringBuilder()
    withoutSpace.forEachIndexed { index, c ->
        if (regex.matches(c.toString())) {
            duplicate.append(c)
        }
    }
    val reversed = duplicate.reversed()
    return reversed.toString() == duplicate.toString()
}
