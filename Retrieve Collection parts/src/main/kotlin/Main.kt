fun main(args: Array<String>) {
    val numbersStrings = listOf("one", "two", "three", "four", "five", "six")
    println(numbersStrings.slice(1..3))
    println(numbersStrings.slice(0..4 step 2))
    println(numbersStrings.slice(setOf(3,5,0)))

    println("\n")
    println(numbersStrings.take(3))
    println(numbersStrings.takeLast(3))
    println(numbersStrings.drop(1))
    println(numbersStrings.dropLast(5))

    println("\n")
    println(numbersStrings.takeWhile { !it.startsWith("f") })
    println(numbersStrings.takeLastWhile { it != "three" })
    println(numbersStrings.dropWhile{it.length == 3})
    println(numbersStrings.dropLastWhile{it.contains("i")})

    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})

    println("\n")
    val numbersString2=numbersStrings
    println(numbersString2.windowed(3))
}
