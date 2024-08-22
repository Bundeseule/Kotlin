fun main(args: Array<String>) {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println(numbers.map{if(it==3) it * 100 else it * 10})
    println(numbers.mapIndexed { index, value -> if(index==0)null else index * value })
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4, "key5" to 5)
    println(numbersMap.mapKeys{it.key.uppercase()})
    println(numbersMap.mapValues{it.value + it.key.length})


    // Zipping
    val colors = listOf("red", "green", "blue")
    val animals=listOf("fox","bear","wolf")
    println(colors.zip(animals))
    println(colors.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())
}