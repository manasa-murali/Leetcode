fun main() {
    val minStack = MinStack()

}

class MinStack {
    var head: Node? = null
    var ptr: Node? = head
    var minPtr: Node? = null

    fun push(`val`: Int) {
        ptr = head
        if (ptr == null) {
            head = Node(`val`)
        } else {
            while (ptr != null) {
                //use two pointer
            }
        }
    }

    fun pop() {
        if (head == null) {
            throw Exception("No element")
        } else if (head!!.next == null) {
            head = null
        } else {
            head = head!!.next
        }
    }

    fun top(): Int {
        ptr = head
        if (ptr != null) {
            while (ptr!!.next != null) {
                ptr = ptr!!.next
            }
            return ptr!!.`val`
        }
        return -1
    }

    fun getMin(): Int {
        return head!!.`val`
    }
}

class Node(var `val`: Int) {
    var next: Node? = null
}
