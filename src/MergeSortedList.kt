object MergeSortedList {
    @JvmStatic
    fun main(args: Array<String>) {



        val l1_1 = ListNode(1)
        val l1_2 = ListNode(2)
        val l1_3 = ListNode(4)

        l1_1.next = l1_2
        l1_2.next = l1_3


        val l2_1 = ListNode(1)
        val l2_2 = ListNode(3)
        val l2_3 = ListNode(4)
        l2_1.next = l2_2
        l2_2.next = l2_3


        val mergeSortedList = mergeTwoLists(l1_1, l2_1)
        println("[" + printList(mergeSortedList) + "]")


    }

    private fun printList(mergeSortedList: ListNode?): String {
        var ptr = mergeSortedList
        val stringBuilder = StringBuilder()
        if (ptr!!.`val` == null) {
            return ""
        } else {
            while (ptr!!.next != null) {
                stringBuilder.append(ptr.`val`)
                stringBuilder.append(",")
                ptr = ptr.next
            }
            if (ptr.next == null) {
                stringBuilder.append(ptr.`val`)
            }
        }
        return stringBuilder.toString()
    }

    fun mergeTwoLists(node1: ListNode, node2: ListNode): ListNode {

        val l1Node = addTailNode(node1)
        val l2Node = addTailNode(node2)


        if ((l1Node!!.`val` == null && l1Node.next == null)
                && (l2Node!!.`val` == null && l2Node!!.next == null)) {
            return removeTail(l1Node)!!
        } else if (l1Node.`val` == null &&
                (l2Node!!.`val` != null)) {
            return removeTail(l2Node)!!
        } else if (l1Node.`val` != null &&
                (l2Node!!.`val` == null)) {
            return removeTail(l1Node)!!
        }

        val l1Headnode = ListNode(null)
        l1Headnode.next = l1Node
        val l2Headnode = ListNode(null)
        l2Headnode.next = l2Node
        var l1Ptr = l1Headnode.next
        var l2Ptr = l2Headnode.next
        var l2Check = l2Headnode.next


        var maxNode: ListNode = l2Headnode.next!!
        while (l2Check!!.next != null) {
            maxNode = l2Check
            l2Check = l2Check.next
        }
        l2Check = l2Headnode.next
        if (l1Node.`val`!! >= maxNode.`val`!!) {
            while ((l2Check!!.next)!!.`val` != null) {
                l2Check = l2Check.next
            }
            l2Check.next = l1Headnode.next

            return removeTail(l2Node!!)
        }

        while (l1Ptr!!.`val` != null) {
            while (l2Ptr!!.`val` != null) {
                if (l1Ptr!!.`val`!! <= l2Ptr.`val`!!) {
                    l2Headnode.next = l2Ptr.next
                    l2Ptr.next = l1Ptr.next
                    l1Ptr.next = l2Ptr
                    l2Ptr = l2Headnode.next
                    l1Ptr = l1Ptr.next
                    break
                } else {
                    l2Ptr = l2Ptr.next
                }
            }
            l1Ptr = l1Ptr!!.next
            l2Ptr = l2Headnode.next
        }
        return removeTail(l1Node)!!
    }


    fun addTailNode(node:ListNode): ListNode {
        var node1Ptr = node
        if (node.next == null) {
            return node
        }else {
            while ((node1Ptr.next) != null) {
                node1Ptr = node1Ptr.next!!
            }
            val tailnode = ListNode(null)
            tailnode.next = null
            node1Ptr.next = tailnode
        }
        return node
    }

    fun removeTail(node: ListNode): ListNode {
        var nodePtr = node
        if (nodePtr.next == null) {
            return node
        } else {
            while ((nodePtr.next)!!.`val` != null) {
                nodePtr = nodePtr.next!!
            }
            nodePtr.next = null
            return node
        }
    }

    class ListNode(var `val`: kotlin.Int?) {
        var next: ListNode? = null
    }

}