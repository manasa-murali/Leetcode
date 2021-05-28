object ClimbStairs {
    @JvmStatic
    fun main(args: Array<String>) {
        println(climbStairs(10))
    }

    fun climbStairs(count: Int): Int {
        return findFibo(1,2,count-2)
    }

    private fun findFibo(prev: Int, cursum: Int, i: Int): Int {
        var count=i
        if (count==0){
            return cursum
        }else{
           return findFibo(cursum,prev+cursum,--count)
        }

    }


}