fun main(){
    val l1_1 = ListNode(3)
    val l1_2 = ListNode(2)
    val l1_3 = ListNode(0)
    val l1_4 = ListNode(-4)
    l1_1.next = l1_2
    l1_2.next = l1_3
    l1_3.next = l1_4
    l1_4.next = l1_2
    println(hasCycle(l1_1))
}
fun hasCycle(head: ListNode?): Boolean {
    var walker = head
    var runner = head
    while (walker!=null && runner!!.next!=null){
        walker = walker.next
        runner = runner.next!!.next
        if (runner == walker) return true
    }
    return false
}