fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    val longerThan3 = numbers.filter{it.length > 3}
    println(longerThan3)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key101" to 101)
    val filteredMap = numbersMap.filter{it.key.endsWith("1") && it.value > 100}
    println(filteredMap)
}