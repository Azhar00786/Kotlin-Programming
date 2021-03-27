package oops_concept_in_kotlin

/*
    * Generics is a powerful tool which helps to avoid repeating in code.
 */
//Inorder to make the class as generic, we must add <E>, E is a element type.
class GenericsInKotlin<E>(vararg val item: E) {     //vararg allows us to add as many elements of the specified type.
    val elements = item.toMutableList()
    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    private fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

//Generic functions
fun <T> stackOf(vararg data: T): GenericsInKotlin<T> {
    return GenericsInKotlin(*data)      //inorder to get to vararg from the array by using * operator
}

fun main(args: Array<String>) {
    val stack = GenericsInKotlin(1, 2, 3)
    stack.push(22)
    println(stack.pop())
    println(stack.pop())

    val stackTwo = stackOf("Hi", "Hello", "Hey")
    println(stackTwo.pop())
    stackTwo.push("Chet")
    println(stackTwo.pop())
}