// This is the main function where the program execution starts.
fun main() {
// Call findMinAndMax function by assigning the max value of the array to the variable max.
    val max = findMinAndMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,54,16,78,564,5), true)
    // Call findMinAndMax function by assigning the min value of the array to the variable min.
    val min = findMinAndMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,54,16,78,564,5), false)
    // Print max and min values to the console.
    println("The max value is $max \n"+
    "The min value is $min")


}
/*
 * This function is created to find both maximum and minimum value in an array.
 * It takes an array of Integers and a Boolean flag as its parameters.
 * The Boolean flag (searchMax) is used to decide whether to search for max or min value.
 *
 * If the flag is true, it identifies the max value and returns it.
 * If the flag is false, it identifies the min value and returns it.
 */

fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    //Initialize max with the first item in the array.
    var max = numbers[0]
    // Initialize min with the first item in the array.
    var min = max
    // If searchMax is true, then find the maximum value in the array.
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                // Assign the bigger number to max.
                max = number
            }
        }
        // Return the maximum value found.
        return max
    } else {
        // If searchMax is not true, then find the minimum value in the array.
        for (number in numbers) {
            if (number < min) {
                //Assign the smaller number to min.
                min = number
            }
        }
        // Return the minimum value found.
        return min
    }
}




