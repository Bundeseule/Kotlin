fun main() {
//    for (i in 1..10) {
//        println(i)
//    }
//
//    for (i in 1 until 10) {
//        println(i)
//    }
//
//    for(i in 10 downTo 1) {
//        println(i)
//    }
//
//    for(i in 1 until 10 step 2) {
//        println(i)
//    }
//
//    for(i in 1..10) {
//        println(i)
//    }

    var number = 0

    while (number < 10) {
        number++
        println(number)

        var i = 0

        while(i<5){
            if(i==0) break
            i++
            println("****$i")
        }
    }


}

