package oops_concept_in_kotlin

/*
    * Abstract class helps in achieving encapsulation between various classes.
    * With abstract classes we don't need to specify open anymore.
    * When we have an Abstract method in our class we are required to override them in our child class.
    * We cannot add abstract menthods in non abstract class.
 */
abstract class Data {
    fun printData() {
        println("Hello")
    }

    abstract fun printTypeOfData(dataType: String)
}


class SortedData() : Data() {
    override fun printTypeOfData(dataType: String) {
        println(dataType)
    }
}

fun main(args: Array<String>) {
    val obj = SortedData()
    obj.printTypeOfData("SortedData")
    obj.printData()
}
