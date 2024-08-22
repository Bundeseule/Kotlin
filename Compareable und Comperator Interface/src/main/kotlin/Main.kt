fun main(args: Array<String>) {
    val numbers = mutableListOf(2, 3, 4, 5, 654, 7, 8, 3, 9, 10, 11, 12, 13, 14, 40, 20, 50, 100, 60)
    numbers.sorted().forEach { println(it) }

    val laptops = mutableListOf(
        Laptop("Dell", 2021, 4, 600),
        Laptop("Acer", 2022, 8, 100),
        Laptop("Apple", 2023, 16, 1000),
    )
    println("\n")
    laptops.sorted().forEach { println(it) }
    println("\n")
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            0
        }

    }
}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) {
            return 1
        } else if (laptop1.ram < laptop2.ram) {
            return -1
        } else {
            return 0
        }
    }
}
