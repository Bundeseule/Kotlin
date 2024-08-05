fun main() {
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.name}")
    println("Name = ${user.lastName}")
    println("Name = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("Name = ${friend.lastName}")
    println("Name = ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int) {


    constructor(name: String): this(name,"LastName" , 0) {
        println("2nd")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 0){
        println("3rd")
    }

}




