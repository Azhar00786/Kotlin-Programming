package conditionalstatements


/*
    when is similar to switch statement of Java.
    Below code explains how you can use when statement in Kotlin.
    else condition is used when there are no match block available.
 */
fun main(args: Array<String>) {
    val checkingValue: Int = 1
    var flag = 1

    if (checkingValue % 2 == 0) {
        flag = 0
    }

    when (flag) {
        1 -> {
            println("It is odd number")
        }
        0 -> {
            println("It is even number")
        }
        else -> {
            println("Unidentified number")
        }

    }


    //Advance when constructs
    val number: Int = 5
    when (number) {
        5 -> println("Five number")
        5 * 2 -> println("5*1 = 5")       //left hand side value is 5*2 = 5
        "Hi there".length -> println("length is 8")     //left hand side is 8
        in 1..10 -> println("Number is between 1 and 10")   //this check if 5 is between 1 and 10
        in 11..20 -> println("Number is between 11 and 20")
        !in 1..4 -> println("Not in between 1 and 4")   //this checks if 5 is not between 1 and 4
    }


}