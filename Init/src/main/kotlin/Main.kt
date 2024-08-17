fun main() {

    val result = Calculator.sum(5,10)
    Calculator.max
    val max = Int.MAX_VALUE
    println(result)

}

class Calculator(){
    companion object{
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }


}
