fun main() {
    val alarm = 7

    when (alarm) {
        in 1..10 -> println("The number is in the range 1..10")
        12, 7, 14 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
}