package oops_concept_in_kotlin

/*
    * Interfaces define a contract that different classes may follow. To do that they have to override each method and property defined in the interface.
    * Every method and property in interface are by default abstract.
    * Inorder to avoid overriding of methods we can use final keyword
    * overriden functions are open by default and we could stop them by using final keyword
    * Inorder to avoid ambiguity in child class overriden method, when it is extending class and implementing class at the same time, we can use super<class name to use>.methodName
 */
interface Vehicle {
    fun printType()
}

class Car(private val vehicleModel: String) : Vehicle {
    override fun printType() {
        println("Vehicle name is $vehicleModel")
    }
}

class Bike(private val bikeModel: String) : Vehicle {
    override fun printType() {
        println("Bike model name is: $bikeModel")
    }
}

fun main(args: Array<String>) {
    //Runtime polymorphism
    val obj: Vehicle = Bike("Pulsar220")        //Upcasting
    obj.printType()

    val objTwo = Car("Tesla")
    objTwo.printType()
}