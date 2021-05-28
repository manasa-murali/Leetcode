import kotlin.text.StringBuilder

object AddBinary {
    @JvmStatic
    fun main(args: Array<String>) {
        println(addBinary("111", "10"))
    }

    fun addBinary(s1: String, s2: String): String {
        var carry = '0'
        val a: String
        val b: String

        if (s1.length >= s2.length) {
            a = s1
            b = s2
        } else {
            a = s2
            b = s1
        }
        val stringBuilder = StringBuilder()
        add(a, b, carry, stringBuilder)
        stringBuilder.reverse()
        return stringBuilder.toString()
    }

     fun add(a: String, b: String, carry: Char, stringBuilder: StringBuilder): StringBuilder {
        if (a.isEmpty()) {
            if (carry == '0') {
                return stringBuilder
            } else {
                return stringBuilder.append(carry)
            }
        } else {
            if (b.isNotEmpty()) {
                if (a.last() == '1' && b.last() == '1') {
                    if (carry == '0') {
                        stringBuilder.append('0')
                        return add(
                            a.removeRange(a.length - 1, a.length),
                            b.removeRange(b.length - 1, b.length),
                            '1',
                            stringBuilder
                        )
                    } else {
                        stringBuilder.append('1')
                        return add(
                            a.removeRange(a.length - 1, a.length),
                            b.removeRange(b.length - 1, b.length),
                            '1',
                            stringBuilder
                        )
                    }
                } else if (a.last() == '1' || b.last() == '1') {
                    if (carry == '0') {
                        stringBuilder.append('1')
                        return add(
                            a.removeRange(a.length - 1, a.length),
                            b.removeRange(b.length - 1, b.length),
                            '0',
                            stringBuilder
                        )
                    } else {
                        stringBuilder.append('0')
                        return add(
                            a.removeRange(a.length - 1, a.length),
                            b.removeRange(b.length - 1, b.length),
                            '1',
                            stringBuilder
                        )
                    }
                } else {
                    stringBuilder.append(carry)
                    return add(
                        a.removeRange(a.length - 1, a.length),
                        b.removeRange(b.length - 1, b.length),
                        '0',
                        stringBuilder
                    )
                }
            } else {
                return add(
                    a,
                    carry.toString(),
                    '0',
                    stringBuilder
                )
            }
        }
    }
}