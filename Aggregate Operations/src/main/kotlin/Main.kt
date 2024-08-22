fun main(args: Array<String>) {
    val numbers = listOf(4, 2, 6, 88, 3, 1, 0, 100)
    println("The sum is ${numbers.sum()}")
    println("The count is ${numbers.count()}")
    println("The average is ${numbers.average()}")
    println("The max Value is ${numbers.maxOrNull()}")
    println("The min Value is ${numbers.minOrNull()}")
    println("The sum is: ${numbers.sumOf{it*2}}")
}