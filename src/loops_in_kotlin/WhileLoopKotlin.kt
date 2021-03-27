package loops_in_kotlin

/*
    * We use while loop when we dont't know how many iterations we need.
    * while loops are more powerful than for loop as we can have arbitary conditions in it.
 */
fun main(args: Array<String>) {
    var testingNumber = 12345678
    var numberHolder = 0
    while (testingNumber > 0) {
        val temp = testingNumber % 10
        numberHolder = numberHolder * 10 + temp
        testingNumber /= 10
    }
    println("Reverse number is $numberHolder")
}