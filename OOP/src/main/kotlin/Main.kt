fun main() {
    val car1=Car()
    car1.name = "Tesla"
    car1.model ="S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Name is ${car1.name}")
    println("Model is ${car1.model}")
    println("Color is ${car1.color}")
    println("Doors is ${car1.doors}")

    car1.move()
    car1.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car $name is moving...")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}