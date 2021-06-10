package tryouts

import java.util.concurrent.locks.ReentrantLock

var counter = 0
fun main() {
    val reentrantLock = ReentrantLock()
    val thread1 = Thread {
//        synchronized(counter) {
        reentrantLock.lock()
            while (counter < 100) {
                Thread.sleep(150)
                println("Thread1:: $counter")
                counter++
            }
        reentrantLock.unlock()
        //}
    }
    thread1.name = "Thread 1"

    val thread2 = Thread {
//        synchronized(counter){
            reentrantLock.lock()
        while (counter > 0) {
            Thread.sleep(100)
            println("Thread2:: $counter")
            counter--

        }
        //}
        reentrantLock.unlock()
    }

    thread2.name = "Thread 2"
    thread1.start()
    thread2.start()

}

