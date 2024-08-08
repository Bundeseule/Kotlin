fun main() {
    val user = User("Alex", "Dobbin",23)

    //user.favoriteMovie="Interstellar"

    println(user.favoriteMovie)
}

class User(var firstName: String, var lastName: String , var age: Int ) {
    lateinit var favoriteMovie: String
}
