fun main() {
    val user1 = User("Alex", "Dörgenklötsch", 24)
    val user2 by lazy {
        User("User1", "lastName",0)
    }

    println(user2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created")
    }
}
