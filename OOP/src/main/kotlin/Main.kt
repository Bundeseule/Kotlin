fun main() {
    val car1 = Car("Tesla", "S Plaid", "Red", 4)


    println("Name is ${car1.name}")
    println("Model is ${car1.model}")
    println("Color is ${car1.color}")
    println("Doors is ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car()
    car2.name = "BMW"
    car2.model = "X5"
    car2.color = "Blue"
    car2.doors = 5

    println("\n")
    println("Name is ${car2.name}")
    println("Model is ${car2.model}")
    println("Color is ${car2.color}")
    println("Doors is ${car2.doors}")
    car2.move()
    car2.stop()

}

class Car(name: String, model: String, color: String, doors: Int) {
    var name = name
    var model = model
    var color = color
    var doors = doors

    fun move() {
        println("The car $name is moving...")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}



5:41:04