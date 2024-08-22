fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.associateWith { it.length })
    println(numbers.associateWith{it.first().uppercase()})
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

    //Flatten
    val numberSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(numberSets[2][2])
}