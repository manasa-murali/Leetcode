package interviewsets

fun main() {
    println(adjacentAnagrams(arrayOf("cat", "dog", "tac", "god", "act")))
}

fun adjacentAnagrams(str: Array<String>): ArrayList<String> {
    val copy = str.toMutableList()
    val anagramList = ArrayList<Anagram>()
    copy.forEachIndexed { index, s ->
        val sorted = s.toCharArray().sorted()
        val stringBuilder = StringBuilder()
        sorted.forEach {
            stringBuilder.append(it)
        }
        val newString = stringBuilder.toString()
        anagramList.add(Anagram(index = index, sorted = newString, original = s))
    }
    anagramList.sortBy {
        it.sorted
    }
    val arrayList = ArrayList<String>()
    anagramList.forEach {
        arrayList.add(it.original)
    }
    return arrayList
}

data class Anagram(
    val index: Int,
    val sorted: String,
    val original: String
)