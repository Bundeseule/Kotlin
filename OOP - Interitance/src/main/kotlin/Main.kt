fun main() {
    val car = Car("BMW","RED",1,4)
    val plane=Plane("Boeing", "BLUE",4,4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving")
    }

    open fun stop(){
        println("$name is stopped")
    }
}

class Car(name: String,color: String, val engines:Int, val doors: Int): Vehicle(name,color){

}

class Plane(name:String, color: String, val engines:Int,val doors: Int):Vehicle(name,color){
    override fun move() {
        flying()
        super.move()
    }

    fun flying(){
        println("The plane is flying")
    }
}