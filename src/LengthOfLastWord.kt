object LengthOfLastWord {
    @JvmStatic
    fun main(args: Array<String>) {
        val result = lengthOfLastWord("Hello World ")
        println(result)

    }
    fun lengthOfLastWord(s: String): Int {
        val split = s.split(" ")
        val reversed = split.reversed()
        reversed.forEach{
            if (it!=""){
                return it.length
            }
        }
        return 0
    }
}