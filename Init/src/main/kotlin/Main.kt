fun main() {
    val calculator = Calculator()
    calculator.sum(5,10)

}

class Calculator(){
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

}
