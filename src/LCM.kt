object LCM {
    @JvmStatic
    fun main(args:Array<String>){
        println(findLCM(5,5).toString())

    }

    private fun findLCM(a: Int, b: Int):Int {
        if (a==0 ||b==0){
            return 0
        }else if(a==b){
            return a
        }else{
            val big= Math.max(a,b)
            val small= Math.min(a,b)
           return small* findLCM(big,big/small)
        }
    }
}