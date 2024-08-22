fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.associateWith { it.length })
    println(numbers.associateWith { it.first().uppercase() })
    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))

    //Flatten
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (numbers in numberSets) {
        for (number in numbers)
            println(number)
    }
    println("\n")
}