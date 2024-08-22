fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    val longerThan3 = numbers.filter{it.length > 3}
    println(longerThan3)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key101" to 101)
    val filteredMap = numbersMap.filter{it.key.endsWith("1") && it.value > 100}
    println(filteredMap)

    val filteredIndex = numbers.filterIndexed{index, value -> (index != 0)&& (value.length<5) }
    val filteredNot = numbers.filterNot {it.length <= 3}
    println(filteredIndex)
    println(filteredNot)

    val mixedList = listOf(1,2,3,'A','B','C','D','E','F',"Alex","World Hello", false)
    mixedList.filterIsInstance<Boolean>().forEach{
        println(it)
    }
    //Partition
    println("\n")
    val (match, rest) = numbers.partition{it.length > 3}
    println(match)
    println(rest)
}