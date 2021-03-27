package oops_concept_in_kotlin

/*
    * There are many type of visibility modifiers used in Kotlin to achieve the principle of information hiding.
 */
open class Visibilities {
    private var age: Int = 0  //age property value cannot be accessed from outside the Visibilities class.
    protected var name: String = "Azhar" //name property can now be accessed from inside the Visibilities class and from the subclass.
    internal var salary: Float = 0f //salary property can be accessed from anywhere in the same module.
    public var id: Int = 0 //id property can be accessed from anywhere.
}

class Sample : Visibilities() {
    fun dataFromParent() {       //function prints 'Azhar' as the name property is protected.
        println(name)
    }
}

fun main(args: Array<String>) {
    val obj = Sample()
    obj.dataFromParent()
}