fun main(args: Array<String>) {
    val names = arrayOf("John", "Stephen", "Megan")
    val mixedElements = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Name 1", "2", 'a')
    println(" First Element: ${names[0]}")

    names[0] = "Alex"
    println(" First Element: ${names[0]}")

    println("The size of the element is: ${names.size}")

    for (name in names) {
        println(name)
    }

    for (i in mixedElements) {
        if (i is String) {
            println(i)
        }
    }

}