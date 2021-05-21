import java.util.*

object LongestCommonPrefix {

    @JvmStatic
    fun main(args: Array<String>) {
        val strs = arrayOf("ab", "a")
        val lcp = longestCommonPrefix(strs)
        println(lcp)
    }

    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.contains("")) {
            return ""
        } else {
            for (i in 0 until strs.size - 1) {
                for (j in i + 1 until strs.size) {
                    if (strs[i].length > strs[j].length) {
                        val temp = strs[i]
                        strs[i] = strs[j]
                        strs[j] = temp
                    }
                }
            }

            val minLength = strs[0].length
            val stack = Stack<Char>()
            for (i in 0 until minLength) {
                val letter = strs[0].toCharArray()[i]
                var isSamePrefix = true
                for (arrIndex in 1 until strs.size) {
                    if (strs[arrIndex].toCharArray()[i] != letter) {
                        isSamePrefix = false
                        break
                    }
                }
                if (isSamePrefix) {
                    stack.push(letter)
                } else {
                    break
                }
            }

            var prefix = StringBuilder()
            stack.forEach {
                prefix.append(it)
            }

            return prefix.toString()
        }
    }
}