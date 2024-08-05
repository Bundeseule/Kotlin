fun main() {
    val user = User("Alex")
    val friend = User(
        firstName = "John",
        lastName = "Smith"
    )
    val user2= User(age = 19, firstName = "Iona", lastName = "Berrington")

    println("Name: ${user.firstName}")
    println("Age: ${user.age}")
    println("Age: ${user.age}")

    println("\n")

    println("Name: ${friend.firstName}")
    println("LastName: ${friend.lastName}")
    println("Age: ${friend.age}")
}

class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {


}





