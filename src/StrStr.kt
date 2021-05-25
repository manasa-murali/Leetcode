object StrStr {
    @JvmStatic
    fun main(args: Array<String>) {
        val hayStack = ""
        val needle = "a"
        val index = strStr(hayStack, needle)
        println(index)
    }

    fun strStr(hayStack: String, needle: String): Int {
        if (hayStack.isNotEmpty() && needle.isEmpty()) {
            return 0
        }

        var i = 0;
        val size = hayStack.length - needle.length
        while (i <= size) {
            if (hayStack.substring(i, i + needle.length) == needle) {
                return i
            } else {
                i++
            }
        }
        return -1
    }
}