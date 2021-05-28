object DeleteDupicates {
    @JvmStatic
    fun main(args: Array<String>) {
        val l1_1 = ListNode(1)
        val l1_2 = ListNode(1)
        val l1_3 = ListNode(4)
        l1_1.next = l1_2
        l1_2.next = l1_3
        l1_3.next = null
        deleteDuplicates(l1_1)
    }

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var ptr = head
        var curNode = head
        if (head == null) {
            return head
        }
        while (ptr!!.next != null && curNode!!.next != null) {
            if (ptr.`val` == ptr.next!!.`val`) {
                curNode.next = ptr.next!!.next
            } else {
                ptr = curNode.next
                curNode = curNode.next
            }
        }
        return head
    }

    class ListNode(var `val`: kotlin.Int?) {
        var next: ListNode? = null
    }
}