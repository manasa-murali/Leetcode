package interviewsets

/** Given a string , find all anagrams of the string
 *  abc, acb, bac, bca, cab, cba
 */
fun main() {
    val array: ArrayList<String> = findAnagrams("")
    println(array)
    println(array.size)
}

fun findAnagrams(s: String): ArrayList<String> {
    return anagram(s)
}

fun anagram(s: String): ArrayList<String> {
    var ways = findFactorial(s.length, 1)
    if (ways == 1) {
        return arrayListOf(s)
    }
    val arrayList = ArrayList<String>()
    var string = s
    for (i in s.indices) {
        var prefix = s[i]
        var newString = string.removeRange(i, i + 1).toCharArray()
        arrayList.add(prefix + string.removeRange(i, i + 1))
        val length = newString.size
        for (j in 0 until length - 1) {
            val temp = newString[j + 1]
            newString[j + 1] = newString[j]
            newString[j] = temp
            newString.toString()
            val stringBuilder = StringBuilder()
            stringBuilder.append(prefix)
            stringBuilder.append(newString)
            arrayList.add(stringBuilder.toString())
        }
    }

    return arrayList
}
