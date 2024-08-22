fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy(keySelector = { it.first().uppercase() }, valueTransform = { it.uppercase() }))
}