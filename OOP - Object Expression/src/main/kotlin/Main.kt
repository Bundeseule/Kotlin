fun main() {


    val loginButton = Button("Login", 1232, object : OnClickListener {
        override fun onClick() {
            //TODO: login the user
        }
    })
    val signUpButton = Button("Sign Up", 1231, object : OnClickListener {
        override fun onClick() {
            //TODO: sign up the user
        }
    })
}

class Button(val text:String, val id:Int, onClickListener:OnClickListener)

class ClickListener():OnClickListener{
    override fun onClick() {

    }
}

interface OnClickListener{
    fun onClick()
}