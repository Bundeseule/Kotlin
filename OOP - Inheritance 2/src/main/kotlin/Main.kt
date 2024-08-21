fun main() {
    val view = View()
    val button = Button("Login","Center")
    val roundButton = RoundButton("Sing up","Center",30)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View(){

    open fun draw(){
        println("Draw View")
    }
}

open class Button(val text: String, val orientation: String):View(){
    override fun draw(){
        //here is the code for creating the button
        println("Drawing the button")
        super.draw()
    }
}

class RoundButton(text:String, orientation:String, val corners: Int):Button(text,orientation){
    override fun draw(){
        println("Drawing the round button")
        super.draw()
    }
}