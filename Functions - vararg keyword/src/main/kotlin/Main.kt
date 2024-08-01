fun main() {
    println(sum(5,8,4,10,5,5,8,4,6,5,5,3,7))
}

fun sum(vararg numbers:Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}