fun main() {
    val car1 = Car("Tesla", "S Plaid", "Red", 4)


    println("Name is ${car1.name}")
    println("Model is ${car1.model}")
    println("Color is ${car1.color}")
    println("Doors is ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("BMW", "X5", "Blue", 5)


    println("\n")
    println("Name is ${car2.name}")
    println("Model is ${car2.model}")
    println("Color is ${car2.color}")
    println("Doors is ${car2.doors}")

    car2.move()
    car2.stop()

}

class Car(var name: String, var model: String, var color: String, var doors: Int) {


    fun move() {
        println("The car $name is moving...")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}