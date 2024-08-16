fun main() {
    val calculator = Calculator()
    val result: Int = calculator.sum(5,10)
    println(result)

}

class Calculator(){
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

}
