fun main(args: Array<String>) {
    val numbersStrings = listOf("one", "two", "three", "four", "five", "six", "seven", "eight")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))
    println(numbersStrings.joinToString(separator = " | ", prefix = ":", postfix = ": end"))
    val numbers = (1 .. 100).toList()
    println(numbers.joinToString(limit = 15, truncated = "<...>"))

    println(numbersStrings.joinToString{"Element:  ${it.uppercase()}"})
}