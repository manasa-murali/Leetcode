fun main(){
    val l1_1 = ListNode(3)
    l1_1.next =null
    println(hasCycle(l1_1))
}
fun hasCycle(head: ListNode?): Boolean {
    var walker = head
    var runner = head
    if(runner!=null && runner.next== null){
        return false
    }
    while (walker!=null && runner!!.next!=null){
        walker = walker.next
        if(runner.next!!.next == null){
            return false
        }
        runner = runner.next!!.next
        if (runner == walker) return true
    }
    return false
}