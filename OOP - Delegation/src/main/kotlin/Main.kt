import kotlin.reflect.KProperty
import kotlin.properties.ReadWriteProperty

fun main() {
    val user = User()
    with(user) {
        firstName = "Alex"
        lastName = "Peter"
    }
    with(user){
        println("$firstName $lastName")
    }
}

class User{
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?, String>{
    private var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    )
    {
        formattedString = value.lowercase()
    }


}