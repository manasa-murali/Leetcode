import com.sun.org.apache.bcel.internal.generic.IFEQ

fun main() {
    val result = plusOne(arrayOf(1, 0, 0, 0, 0).toIntArray())
    println(result.contentToString())
}

fun plusOne(array: IntArray): IntArray {
    val arrayList = array.toMutableList()
    var carry = 0
    for (i in array.size - 1 downTo 0) {
        var add = if (i == array.size - 1) 1 else 0
        if ((arrayList[i] + add + carry) != 0 && (arrayList[i] + add + carry) % 10 == 0) {
            arrayList[i] = (arrayList[i] + add + carry) % 10
            carry = 1
            if (i == 0) {
                arrayList.add(0, carry)
            }
        } else {
            arrayList[i] = (arrayList[i] + add + carry) % 10
            carry = 0
        }
    }
    return arrayList.toIntArray()
}

