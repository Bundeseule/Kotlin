fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.associateWith { it.length })
    println(numbers.associateWith{it.first().uppercase()})
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}