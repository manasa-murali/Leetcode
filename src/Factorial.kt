object Factorial {
    @JvmStatic
    fun main(args: Array<String>) {
        val result = findFactorial(0)
        println(result)
    }

    private fun findFactorial(i: Int): Int {
        if (i==1|| i==0){
            return 1
        }else{
            return i* findFactorial(i-1)
        }
    }

}