fun main(args: Array<String>) {
    val names = arrayOf("John", "Stephen", "Megan")
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Name 1", "2")
    println(" Frist Element: ${names[0]}")

    names[0] = "Alex"
    println(" Frist Element: ${names[0]}")

    println("The size of the element is: ${names.size}")

    for(name in names) {
        println(name)
    }

    for (i in numbers){
        println(i)
    }

}