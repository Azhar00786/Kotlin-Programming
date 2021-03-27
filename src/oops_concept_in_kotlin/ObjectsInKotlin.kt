package oops_concept_in_kotlin

/*
    * object is use to create a singelton class in Kotlin of which we could have only one instance of.
*/

object ObjectsInKotlin {
    fun sampleMethod() {
        println("Singelton method")
    }
}

fun main(args: Array<String>) {
    val obj = ObjectsInKotlin
    obj.sampleMethod()
}