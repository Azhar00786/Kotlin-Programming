package oops_concept_in_kotlin

/*
    * Inheritance is mainly used for code reusability
    * Inorder to perform inheritance in Kotlin you have to make your parent class open
      And all the values which you want to use in child class
 */
open class Person(open var name: String) {
    fun printName() {
        println("Name is : $name")
    }
}

class Employee(override var name: String) : Person(name)

class Student(override var name: String) : Person(name)

fun main(args: Array<String>) {
    val empObj = Employee("Raj")
    empObj.printName()

    val studentObj = Student("Shaka")
    studentObj.printName()
}