package tryouts


@Volatile
var price = 0

fun main() {

    val thread1 = Thread {
//        synchronized(price) {
        Thread.sleep(300)
        if (price > 0) {
            price -= 200
            println("Thread1:" + price)
        }
        //  }
    }
    val thread2 = Thread {
//        synchronized(price) {
        Thread.sleep(100)
        if (price > 0) {
            price -= 400
            println("Thread2:" + price)
        }
        // }
    }

    thread1.start()
    thread2.start()

}