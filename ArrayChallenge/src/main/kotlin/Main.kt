/*
 * This is a simple Kotlin console application designed to search for the maximum and minimum values
 * in an array of integers. It makes use of two custom functions, `findMax()` and `findMin()`.
 */
fun main() {
    /*
 * Upon starting the application, the `main()` function initializes an array of fixed integers
 * and the array is passed to the `findMax()` and `findMin()` functions. They respectively calculate
 * and return the maximum and minimum values in the array. The results are then printed to the console.
*/
    val max = findMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    val min = findMin(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(
        "Max Value: $max\n" +
                "Min Value: $min"
    )
}

// Function to find maximum value
/*
 * The `findMax()` function takes an array of integers as parameter and returns
 * the maximum value. It iterates over every value in the array, and if it encounters
 * a number that is greater than the current max value, it updates the max value. Finally,
 * it returns the maximum value.
 */
fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) max = number

    }

    return max
}

// Function to find minimum value
/*
 * The `findMin()` function operates similarly to `findMax()`, but in contrast,
 * it attempts to find the minimum value in an array of integers. It iterates over each
 * number, updating the minimum value if it encounters a number less than the current min value.
 * Finally, it returns the minimum value.
 */
fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers) {
        if (number < min) min = number

    }

    return min
}

