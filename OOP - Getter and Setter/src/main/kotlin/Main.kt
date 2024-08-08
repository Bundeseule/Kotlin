fun main() {
    val user = User("Alex")
    val friend = User(
        firstName = "John",
        lastName = "Smith"
    )
    val user2 = User(age = 19, firstName = "Iona", lastName = "Berrington")

    user.firstName = "Vlad"

    println(user.firstName)
    println(user.age)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)
}

class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName
        get() {  // = field,   ist auch genug
            return "FirstName:  $field"
        }
        set(value) {
            println("$value was assigned to firstname property")
            field = value
        }

    fun getFirstName(): String {
        return this.firstName
    }

    fun setFirstName(): String {
        this.firstName = firstName
        return firstName
    }
}
