fun main() {
    println(groupAnagrams(arrayOf("")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val mapList = ArrayList<HashMap<Char, Int>>() //keys
    val groupAnagramsMap = HashMap<HashMap<Char, Int>, ArrayList<String>>()
    strs.forEach {
        val charList = it.toCharArray().toList()
        val hashMap = getMap(charList)
        if (!mapList.contains(hashMap)) {
            mapList.add(hashMap)
        }
    }
    strs.forEach {
        for (i in 0 until mapList.size) {
            val map = mapList[i]
            val hashMap = getMap(it.toCharArray().toList())
            if (map == hashMap) {
                var found = false
                groupAnagramsMap.keys.forEach { key ->
                    if (key == map) {
                        groupAnagramsMap[hashMap]!!.add(it)
                        found = true
                    }
                }
                if (!found) {
                    groupAnagramsMap[hashMap] = arrayListOf(it)
                }
                break
            }
        }

    }


    val finalList = ArrayList<ArrayList<String>>()

    groupAnagramsMap.keys.forEach {
        finalList.add(groupAnagramsMap[it]!!)
    }
    finalList.sortBy {
        it.size
    }
    return finalList
}

fun getMap(charList: List<Char>): java.util.HashMap<Char, Int> {
    val hashMap = HashMap<Char, Int>()
    charList.forEach { character ->
        var count = hashMap.getOrDefault(character, 0)
        count += 1
        hashMap[character] = count
    }
    return hashMap
}