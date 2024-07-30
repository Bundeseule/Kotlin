fun main() {
    var x = 5
    val y = 3
// One double is enough for all results to be double
//    val result = x + y
/*
Block comment
 */
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y
    println("result + = $result")
    result += 2
    println("result - = $result")
    result -= 2
    println("result * = $result")
    result *= 2
    println("result / = $result")
    result /= 2
    println("result %= $result")
    result %= 2
    println("result = $result")

    println("(3 + 3) * 4 = ${(3 + 3) * 4}")
    println("3 + 3 * 4 = ${3 + 3 * 4}")

    x=0
    println("x = ${x++}")
    println("x = ${x}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${x}")
    println("x = ${--x}")


}