package functions_in_Kotlin
/*
    * Function is a block of code, which is used to perform some particular function.
    * Below are the available types of function in kotlin
 */

//no parameters,string type return value
fun stringPrinter(): String {
    return "Hello"
}

//no parameters,no return value
fun stringPrinterTwo() {
    println("Hi")
}

//2 parameters,no return value
fun greaterNumber(a: Int, b: Int) {
    if (a > b) {
        println("$a is greater")
    } else {
        println("$b is greater")
    }
}

//2 parameters, 1 Int return value
fun smallerNumber(a: Int, b: Int): Int {
    if (a < b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    println(stringPrinter())
    stringPrinterTwo()
    greaterNumber(14, 22)
    println(smallerNumber(2, 5))
}