package oops_concept_in_kotlin

/*
    *Named Parameters make our Kotlin code more readable and allow us to change the sequence of parameters of class and methods while making them a call.
    *Default Parameters are the one which are used when we don't specify the value of the parameter while calling functions or classes.
    *Default Parameters can also be use for achieving Method Overloading in Kotlin
 */
class NamedAndDefaultParameters(var age: Int, var name: String, var salary: Int = 0) {
    fun printAll() {
        println("EmployeeDetails[age: $age, name: $name, salary: $salary]")
    }
}

fun main(args: Array<String>) {
    val obj = NamedAndDefaultParameters(name = "Azhar", salary = 2000, age = 25)
    obj.printAll()

    //here we did not specify the salary, so default value will be used
    //As we can see below, we have achieved method overloading by using different constructor for objTwo and objThree
    val objTwo = NamedAndDefaultParameters(name = "Raj", age = 22)
    objTwo.printAll()

    val objThree = NamedAndDefaultParameters(age = 22, name = "Rajneesh", salary = 2222)
    objThree.printAll()


}