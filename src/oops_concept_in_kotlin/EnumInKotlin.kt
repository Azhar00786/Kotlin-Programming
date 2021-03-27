package oops_concept_in_kotlin

//enum class syntax
enum class Color {
    RED, BLUE, GREEN
}

class EnumInKotlin {
    fun printColor() {
        println("${Color.BLUE}")
        println("${Color.RED}")
        println("${Color.GREEN}")
    }
}

fun main(args: Array<String>) {
    val obj = EnumInKotlin().printColor()
}