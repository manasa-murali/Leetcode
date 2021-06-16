package interviewsets

fun main() {
    println(
        groupAnagrams2(
            arrayOf(
                "burbank",
                "collectibles",
                "soaping",
                "rehearsal",
                "crosier",
                "syphilitics",
                "decrepitude",
                "uncannily",
                "axiomatically",
                "modulated",
                "middy",
                "intoxicate",
                "oklahomans",
                "buckskins",
                "divorce",
                "distributes",
                "hellenize",
                "peters",
                "locate",
                "saar",
                "verbals",
                "keg",
                "bombardier",
                "bribing",
                "grosses",
                "sag",
                "ivanhoe",
                "hollered",
                "paraphrases",
                "grouch",
                "importunes",
                "underbids",
                "diehard",
                "selectman",
                "slugging",
                "caisson",
                "carcinomata",
                "supering",
                "inhalators",
                "spittle",
                "approximates",
                "heep",
                "predecessors",
                "inlay",
                "indecency",
                "strewed",
                "multinationals"
            )
        )
    )
}

fun groupAnagrams2(str: Array<String>): List<ArrayList<String>> {
    var copy = str.toMutableList()
    copy.forEachIndexed { index, s ->
        val sorted = s.toCharArray().sorted()
        copy[index] = sorted.toString()
    }
    val hashMap = HashMap<String, ArrayList<String>>()
    copy.forEachIndexed { index, it ->
        if (hashMap.containsKey(it)) {
            hashMap[it]!!.add(str[index])
        } else {
            hashMap[it] = arrayListOf(str[index])
        }
    }

    val values = hashMap.values
    values.sortedBy {
        it.size
    }
    return values.toList()

}
