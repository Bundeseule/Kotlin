fun main(args: Array<String>) {
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println(numbers.map{if(it==3) it * 100 else it * 10})
}