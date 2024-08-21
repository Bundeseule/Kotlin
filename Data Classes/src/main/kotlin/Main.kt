fun main() {
    val user1 = User("Alex","Dobin",23)
    val user2 = User("Alex","Dobin",23)

    println(user1.equals(user2))
    println(user1)
    println(user2)

}

data class User(var firstName: String, var lastName: String, var age: Int) {

}