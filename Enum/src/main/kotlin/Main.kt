fun main() {
    for(direction in Direction.values()){
        println(direction.direction)
    }
}

enum class Direction(var direction: String, var distance:Int) {
    NORTH("north", 90){},
    SOUTH("south", 180),
    EAST("east", 270),
    WEST("west", 90),
}