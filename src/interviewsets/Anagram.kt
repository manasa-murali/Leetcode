package interviewsets

fun main() {
    println(isAnagram("aacc", "ccac"))
}

fun isAnagram(word1: String, word2: String): Boolean {

    var hashMap1 = HashMap<Char, Int>()
    var hashMap2 = HashMap<Char, Int>()

    if (word1.length != word2.length) return false
    word1.forEach {
        var count1: Int = hashMap1.getOrDefault(it, 0)
        count1 += 1
        hashMap1[it] = count1
    }
    word2.forEach {
        var count2: Int = hashMap2.getOrDefault(it, 0)
        count2 += 1
        hashMap2[it] = count2
    }

    return hashMap1 == hashMap2
}