fun main() {

}

abstract class Vehicle(){

    abstract fun move()



    abstract fun stop()


}

class Car(var name:String, var color:String,val engine :String, val doors:Int): Vehicle(){
    override fun move() {

    }

    override fun stop() {

    }

}