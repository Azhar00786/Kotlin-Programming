package conditionalstatements
/*
* Below code explains how to use if conditional statement in Kotlin.
* Below code is a simple example of how to check if a particular number is even or odd.
* */

fun main(args: Array<String>) {
    //change this number to check different numbers
    val checkingValue: Int = 3

    if (checkingValue % 2 == 0) {
        println("It is a even number")
    } else {
        println("It is odd number")
    }
}