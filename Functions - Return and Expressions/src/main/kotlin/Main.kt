fun main() {
    val max = getMax(5, 9)
    println(max)
}

fun getMax(a: Int, b: Int): Int {
//    val max = if (a > b) a else b
//    return max
    return if (a > b) a else b
   // after return, code will not be executed
}

// Best Way to Do it
// fun getMax(a: Int, b: Int) = if (a > b) a else b