fun main() {
    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("Next level opened")
    }else{
        println("Still at the same level")
    }
// if statements can be stored in a variable
    val num1 =  5
    val num2 = -3
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true")
        "This is text 1"
    }else{
        println("The condition is false")
        "This is text 2"
    }

    println("Text in der Variable: $text")
}