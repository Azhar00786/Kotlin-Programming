package conditionalstatements

import java.util.*

/*
    Question: Generating random numbers and checking which range they fall into. random number should be between 1 to 50
              and range should be 1 to 10,11 to 20,21 to 30,31 to 40,41 to 50

              You can see Challenge.pdf for question
 */

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1
    when (random) {
        in 1..10 -> println("$random Number is between 1 to 10")
        in 11..20 -> println("$random Number is between 11 to 20")
        in 21..30 -> println("$random Number is between 21 to 30")
        in 31..40 -> println("$random Number is between 31 to 40")
        in 41..50 -> println("$random Number is between 41 to 50")
        else -> println("Number can not be categorized")
    }
}