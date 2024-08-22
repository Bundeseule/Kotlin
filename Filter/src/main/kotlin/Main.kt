fun main() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    val longerThan3 = numbers.filter{it.length > 3}
    println(longerThan3)
}