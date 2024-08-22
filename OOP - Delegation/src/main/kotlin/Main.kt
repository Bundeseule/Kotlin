import kotlin.reflect.KProperty
import kotlin.properties.ReadWriteProperty

fun main() {

}

class App: A by FirstDelegate(),B by SecondDelegate(){
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A{
    override fun print() {

    }
}

open class SecondDelegate: B{
    override fun print2() {

    }
}

class FormatDelegate: ReadWriteProperty<Any?, String>{
    private var formattedString: String = ""

    override fun getValue(
        this.Ref: Any?,
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