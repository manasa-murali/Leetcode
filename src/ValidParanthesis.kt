import java.util.*

fun main() {
    val strs = ""
    val isValid = isValid(strs)
    println(isValid)
}

fun isValid(strs: String): Boolean {

    val stack = Stack<Char>()

    if (strs.isEmpty()) return false
    for (str in strs) {
        if (str == '(' || str == '{' || str == '[') {
            stack.push(str)
        } else {
            if (stack.isNotEmpty()) {
                if (str == ')') {
                    if (stack.peek() == '(') {
                        stack.pop()
                    } else {
                        return false
                    }

                } else if (str == '}') {
                    if (stack.peek() == '{') {
                        stack.pop()
                    } else {
                        return false
                    }

                } else if (str == ']') {
                    if (stack.peek() == '[') {
                        stack.pop()
                    } else {
                        return false
                    }
                }
            } else return false
        }
    }
    return stack.isEmpty()
}
