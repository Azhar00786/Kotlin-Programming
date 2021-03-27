package conditionalstatements

/*
    Below expressions are example of conditional expression.
 */
fun main(args: Array<String>) {
    val mode: Int = 2

    val result = when (mode) {
        1 -> "First"
        2 -> {
            println("Hi")               //as you can see when we select 2 the first line is printed and second line is stored in the result variable
            "Second"
        }
        3 -> "Third"
        else -> "None of the above"
    }

    val resultTwo = if (mode > 0) {
        println("Second line")          //when we put 22 before println it throws warning and if we put it after pprintln it is stored in resultTwo variable
        22
    } else {
        println("Else condition")
        23
    }

    println(resultTwo)
    println(result)
}