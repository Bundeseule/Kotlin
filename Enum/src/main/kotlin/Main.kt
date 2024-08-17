fun main() {
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.name)
}

enum class Direction(var direction: String, var distance:Int) {
    NORTH("north", 90){},
    SOUTH("south", 180),
    EAST("east", 270),
    WEST("west", 90),
}