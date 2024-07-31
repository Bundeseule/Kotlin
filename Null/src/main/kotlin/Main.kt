fun main() {
    var text: String? = "Name"
    text = null
    if(text != null){
        println(text.length)
    }else{
        println("Text is null")
    }
}