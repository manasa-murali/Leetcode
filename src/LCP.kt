object LCP {

    @JvmStatic
    fun main(args: Array<String>) {
        val strs = arrayOf("flower", "flo","fl")
        val lcp = longestCommonPrefix(strs)
        println(lcp)
    }
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        return prefix
    }
}