fun main() {
    // This are names parameters
    sendMessage(

        name = "Alexa"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Sending message to $name: $message")
}

fun sendText() = "This is a text message"
