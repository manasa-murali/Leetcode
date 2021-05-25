object ValidAnagram {
    @JvmStatic
    fun main(args: Array<String>) {
        val result = isValid("alllls","sallll")
        println(result)

    }

     fun isValid(s1: String, s2: String): Boolean {
        if (s1.length!=s2.length){
            return false
        }
        var hashMap = HashMap<Char, Int>()
        var hashMap2 = HashMap<Char, Int>()
        for (c in s1) {
            if (hashMap.containsKey(c)){
                hashMap[c] = hashMap.getValue(c)+1
            }else{
                hashMap[c] = 1
            }
        }

        for (c in s2) {
            if (!hashMap.containsKey(c)){
                return false
            }else{
                if (hashMap2.containsKey(c)){
                    hashMap2[c] = hashMap2.getValue(c)+1
                }else{
                    hashMap2[c] = 1
                }
            }
        }

//        hashMap.forEach{ entry ->
//           if (entry.value != hashMap2[entry.key]){
//               return false
//           }
//        }
         return hashMap==hashMap2


    }
}