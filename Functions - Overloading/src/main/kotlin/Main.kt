fun main() {
    val max = getMax(6.5, 9.6)
    println(max)
}

fun getMax(a: Int, b: Int)= if (a > b) a else b
fun getMax(a: Double, b: Double)= if (a > b) a else b