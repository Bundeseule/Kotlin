fun main() {
    val user = User("Alex")
    val friend = User("John","Smith")

    println("Name: ${user.name}")
    println("Age: ${user.age}")
    println("Age: ${user.age}")

    println("\n")

    println("Name: ${friend.name}")
    println("LastName: ${friend.lastName}")
    println("Age: ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int) {

    constructor(name: String): this(name, "LastName", 0)

    constructor(name: String, lastName: String): this(name, lastName, 0)
}





