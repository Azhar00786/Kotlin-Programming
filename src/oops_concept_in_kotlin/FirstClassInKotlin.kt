package oops_concept_in_kotlin


/*
    *When we have function inside classes we call them methods
    *init block is executed one time for every object
    *
    * Inorder to avoid init block we could directly write class FirstClassInKotlin(var name: String,var id : Int){}
 */
class FirstClassInKotlin(name: String, id: Int) {
    var name: String = "Azhar"
    var id: Int = 1

    init {
        this.name = name
        this.id = id
    }

    fun check(): Int {
        return 4 - id
    }

    //the above function can be return in one line
    fun checkTwo(): Int = 4 - id
}

fun main(args: Array<String>) {
    //Creating a object of class FirstClassInKotlin and accessing the default value stored
    //val obj = FirstClassInKotlin()  -> Used when there was no constructor added
    val obj = FirstClassInKotlin("AZ", 2)
    println(obj.id)
    println(obj.name)

    //Changing the properties of class FirstClassInKotlin
    obj.id = 2
    obj.name = "Shaikh"
    println(obj.check())
    println(obj.checkTwo())
    println(obj.name + ":" + obj.id)

}