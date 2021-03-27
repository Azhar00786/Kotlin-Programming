package collections


/*
   *Array

	* Array is a container for multiple elements.
    * General rule of thump is, you can use array if you know how many elements you have and that number is not gonna change.
    * Array are very useful to loop over.
    * You need a loop to print all values of array.

	example: val array = arrayOf("Texas","Iowa","California")


* List
	* example: val list = listOf("orange","Apple","Banana")
    * General rule of thump is, you can use List if you know how many elements you have and that number is not gonna change.
	* The above example creates a immutable list, so you can't change the contents of it.
	* You can print whole list without loop using: println(listName)

* ArrayList
	* Inorder to change the data as you like you can create ArrayList.
	* It basically combines arrays and list.
	* It a list that internally stores the elements in an Array and it resizes the array if necessary.
    * We can print list using: println(listName)
	* example: val arraylist = arrayListOf("Patrick","Michael","Sarah")
			 arraylist.add("Sandra")
 */
fun main(args: Array<String>) {
    //array example
    val arr = arrayOf("1", "2", "3")
    var i = 0
    while (i < arr.size) {
        println(arr[i])
        i++
    }


    //List example
    val list = listOf<Int>(1, 2, 3, 4, 5)
    println(list)

    //ArrayList
    val arrayList = ArrayList<Int>(5)
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList.add(5)
    arrayList.add(22)   //extra element than the initial capacity can be added
    arrayList.remove(22)

    //sublist
    val modArray = arrayList.subList(1, 4)           //remove a piece of portion from an collection
    println(modArray)

    println(arrayList)
}