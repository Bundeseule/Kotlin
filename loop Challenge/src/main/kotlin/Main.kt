fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounted  = 0

    while (number <= lastNumber) {
        number++
        if (!isEvenNumber(number)) {
            continue
        }
        evenNumberCounted++
        println(number)
    }
    println("Total Numbers of even numbers found: $evenNumberCounted")



}

fun isEvenNumber(number: Int): Boolean {
    if ((number % 2) == 0) {
        return true
    } else {
        return false
    }

}

////////////////////////////////////4:36:55