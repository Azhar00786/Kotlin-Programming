package loops_in_kotlin

/*
    Qusetion:- Try to write a program that
    calculates the sum of all numbers
    from 100 to 100,000 and prints out the result.
 */
fun main(args: Array<String>) {
    var sum: Long = 0
    for (number in 100..100000) {
        sum += number
    }
    println("Sum is $sum")
}