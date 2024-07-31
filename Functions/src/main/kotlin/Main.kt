fun main() {
    sayHello("Alex", 22)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some Data")
    }else{
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    var number = age

    println("Hello, $name, you're $age")
}

fun getData(data: String){
    println("Data: $data")
}

fun showMessage(){
    println("There is no Internet Connection")
}