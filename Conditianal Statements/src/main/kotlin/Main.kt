fun main() {
    val isActive = true
    if (isActive){   // when false, use !isActive
        println("The user is active")
    }else{
        println("The user is not active")
    }

    var myNumber = 100
    if (myNumber != 150){   // when false, use !isActive
        println("Less than or equal 150")
    }else if (myNumber < 90){
        println("Greater than 90")
    }else {
        println("All the conditions failed")
    }
}