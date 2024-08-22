fun main() {
    val names = mutableListOf("Name 1", "Name 2", "Name 3")

    names.add("Name 4")
    names.remove("Name 2")


    names.forEach { (println(it)) }
}