/**
 * The main method is the entry point of the program.
 * It demonstrates the usage of variables and prints out some information.
 */
fun main(){
    var userName: String = "Alex"
    userName = "John"

    var age: Int = 22
    age = 25

    val maxIntegerNumber: Int = Int.MAX_VALUE
    val minIntegerNumber: Int = Int.MIN_VALUE

    println("Hello $userName, your age is $age." +
            "\nInt maximum value is: $maxIntegerNumber" +
            "\nInt minimum value: $minIntegerNumber" )

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE

    println("Maximal Byte value is: $myMaxByteValue")
    println("Minimal Byte value is: $myMinByteValue")

    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE

    println("Maximal short value is: $myMaxShortValue")
    println("Minimal short value is: $myMinShortValue")

    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE

    println("Maximal long value is: $myMaxLongValue")
    println("Minimal long value is: $myMinLongValue")

    val myMaxFloatValue: Float = Float.MAX_VALUE
    val myMinFloatValue: Float = Float.MIN_VALUE

    println("Maximal float value is: $myMaxFloatValue")
    println("Minimal float value is: $myMinFloatValue")

    val myMaxDoubleValue: Double = Double.MAX_VALUE
    val myMinDoubleValue: Double = Double.MIN_VALUE

    println("Maximal double value is: $myMaxDoubleValue")
    println("Minimal double value is: $myMinDoubleValue")

    val myMaxCharValue: Char = Char.MAX_VALUE
    val myMinCharValue: Char = Char.MIN_VALUE

    println("Maximal char value is: $myMaxCharValue")
    println("Minimal char value is: $myMinCharValue")

    val myNumber = 28L


}