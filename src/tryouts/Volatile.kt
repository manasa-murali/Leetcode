package tryouts


@Volatile
var price = 500

fun main() {

    val thread1 = Thread {
        if (price - 200 > 0) {
            price -= 200
            println("Thread1:" + price)
        }
    }
    val thread2 = Thread {
        if (price - 400 > 0) {
            price -= 400
            println("Thread2:" + price)
        }

    }

    thread1.start()
    thread2.start()

}