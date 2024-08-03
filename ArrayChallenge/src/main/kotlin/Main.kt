fun main() {
    val max = findMax(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    val min = findMin(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(
        "Max Value: $max\n" +
                "Min Value: $min"
    )
}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) max = number

    }

    return max
}

fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers) {
        if (number < min) min = number

    }

    return min
}

