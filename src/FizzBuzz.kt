fun main() {
    println(fizzBuzz(5).toString())

}

fun fizzBuzz(n: Int): List<String> {
    val arrayList = ArrayList<String>()
    for (i in 1..n) {
        if (i % 15 == 0) {
            arrayList.add("FizzBuzz")
        } else if (i % 5 == 0) {
            arrayList.add("Buzz")
        } else if (i % 3 == 0) {
            arrayList.add("Fizz")
        } else {
            arrayList.add(i.toString())
        }
    }
    return arrayList
}
