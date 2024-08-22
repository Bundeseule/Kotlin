fun main(args: Array<String>) {
    val numbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val plusList=numbers + "ten"
    val minusList=numbers - mutableListOf("four","five","six")
    println(plusList)
    println(minusList)

}