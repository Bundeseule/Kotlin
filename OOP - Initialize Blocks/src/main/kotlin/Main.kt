fun main() {
    val user = User("Alex", "Dobinca", 23)
    val friend = User("John","Smith", 30)
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if(name.lowercase().startsWith("a")) {
            this.name = name
        }else{
            this.name = "User"
            println("The name does nt start with the letter 'a' or 'A'")
        }
    }
}

6:03:25



