import kotlin.concurrent.thread

fun main (args: Array<String>) { //executed on the main thread

    println("Main program starts: ${Thread.currentThread().name}" )

    thread{
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(2000) // pretending to do some work
        println("Fake work finished: ${Thread.currentThread().name}")
    }


    println("Main program ends: ${Thread.currentThread().name}" )
}