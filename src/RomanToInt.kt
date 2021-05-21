import java.util.*

object RomanToInt {
    @JvmStatic
    fun main(args: Array<String>) {
        val romanToInt = romanToInt(roman = "XXIV")
        println(romanToInt)
    }

    fun romanToInt(roman: String): Int { //XXXX

        val hashMap = HashMap<String, Int>()
        hashMap["I"] = 1
        hashMap["V"] = 5
        hashMap["X"] = 10
        hashMap["L"] = 50
        hashMap["C"] = 100
        hashMap["D"] = 500
        hashMap["M"] = 1000

        var result: Int = 0
        var index = 0
        while (index < roman.length) {
            val c = roman.toCharArray()[index]
            val letter = c.toString()
            if (index < roman.length - 1) {
                val nextLetter = roman.toCharArray()[index + 1].toString()
                val currentInt = hashMap[letter]!!
                val nextInt = hashMap[nextLetter]!!
                if (currentInt >= nextInt) {
                    result += currentInt
                    index++
                } else {
                    result += (nextInt - currentInt)
                    index += 2
                }

            } else if (index == roman.length-1){
                result+= hashMap[letter]!!
                index++
            }
        }
        return result
    }
}