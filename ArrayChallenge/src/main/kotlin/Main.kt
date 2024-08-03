fun main() {

    val max = findMinAndMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,54,16,78,564,5), true)
    val min = findMinAndMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,54,16,78,564,5), false)
    println("The max value is $max \n"+
    "The min value is $min")


}


fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}




