package oops_concept_in_kotlin

/*
    *Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
        1 - method of parent class by object of parent class
        2 - method of child class by object of child class
 */


open class Parent {
    open fun printStatementParent() {
        println("This is parent class")
    }
}

class Child : Parent() {
    override fun printStatementParent() {
        println("This is child class")
    }
}

fun main(args: Array<String>) {
    // Trying to achieve runtime polymorphism
    val objParent: Parent
    objParent = Child()     // Upcasting
    objParent.printStatementParent()

    /*
    //Trying to achieve downcasting but showing error
    val objChild: Child
    objChild = Parent() as Child
    objChild.printStatementParent()

    */

    // 1
    val objOne = Parent()
    objOne.printStatementParent()

    // 2
    val objTwo = Child()
    objTwo.printStatementParent()
}
