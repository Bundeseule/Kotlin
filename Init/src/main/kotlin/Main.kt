fun main() {
    val user = User("Alex")

}

class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName

}
