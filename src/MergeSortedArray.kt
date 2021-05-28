object MergeSortedArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val array1 = arrayOf(1,6,0,0).toIntArray()
        val array2 = arrayOf(1,9).toIntArray()
         mergeArrays(array1, 2, array2, array2.size)
        println(array1.contentToString())
    }

     fun mergeArrays(array1: IntArray, m: Int, array2: IntArray, n: Int): Int {
        if (n == 0) {
            return m
        }
         var k =0
         var add=0
         for (i in 0 until n){
           for (j in k until m+add){
               if (array1[j]== array2[i]){
                   for (loop in m+add downTo k){
                       if (loop!=0) {
                           array1[loop] = array1[loop - 1]
                       }
                   }
                   k++
                   add++
                   array1[j]= array2[i]
                   break
               }else if (array1[j]>array2[i]){
                   for (loop in m+add downTo k ){
                       if (loop!=0) {
                           array1[loop] = array1[loop - 1]
                       }
                   }
                   array1[j] = array2[i]
                   k++
                   add++
                   break
               }else{
                   k++
               }
           }
       }
         var rest=0
         for (i in m+add until m+n){
             array1[i]= array2[add+rest]
             rest++
         }
         return array1.size
    }

}