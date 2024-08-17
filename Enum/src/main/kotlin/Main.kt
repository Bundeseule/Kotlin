fun main() {
    val direction=Direction.valueOf("east".uppercase())

    when(direction){
        Direction.NORTH->{"The direction is North"}
        Direction.WEST->{"The direction is West"}
        Direction.SOUTH->{"The direction is South"}
        Direction.EAST->{"The direction is East"}
    }
}

enum class Direction(var direction: String, var distance:Int) {
    NORTH("north", 90){},
    SOUTH("south", 180),
    EAST("east", 270),
    WEST("west", 90);

    fun printData(){
        println("Direction = $direction, distance = $distance")
    }
}