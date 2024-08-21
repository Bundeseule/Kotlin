fun main() {


}

interface Engine {
    fun startEngine()

}

class Car(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Car is starting...")
    }

}

class Truck(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Truck is starting...")
    }
}

class Plane(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Plane is starting...")
    }
}

class Tesla(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Tesla is starting...")
    }
}