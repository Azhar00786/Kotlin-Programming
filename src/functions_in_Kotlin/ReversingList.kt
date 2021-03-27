package functions_in_Kotlin

/*
    Q. A function which is going to accept a list of integers and returns a reverse list.
 */

fun listReverser(arr: List<Int>): List<Int> {
    return arr.reversed()
}


fun main(args: Array<String>) {
    val arr: List<Int> = listOf(1, 2, 3, 4, 5)

    val reverseList = listReverser(arr)
    println(reverseList)

}