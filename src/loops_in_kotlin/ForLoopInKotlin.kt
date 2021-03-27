package loops_in_kotlin

/*
    *   For Loops allow us to repeat certain piece of code a specific number of time.
    *   For using for loop you must know, how many iteration you need to have.
    *   For loop is less error prone.

 */
fun main(args: Array<String>) {

    //example for printing 1 to 100
    for (i in 1..100) {
        println(i)
    }
    //example for printing table from 1 to 1000

    for (tableNumber in 1..1000) {
        println("\n")
        for (number in 1..10) {
            val tempAnswerHolder = tableNumber * number
            println("$tableNumber * $number = $tempAnswerHolder")
        }
    }

    //for loops with index and value of list
    val intList: List<Int> = listOf<Int>(1, 2, 3, 4, 5)
    for ((index, value) in intList.withIndex()) {
        println("Number on $index position is $value")
    }

    for (value in intList) {
        println("$value number")
    }
}