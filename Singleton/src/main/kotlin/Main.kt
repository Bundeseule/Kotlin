fun main() {
    val user1 = User("Alex", "Dörgenklötsch", 24)
    val user2 = User("Möringa", "Ulz", 21)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}
