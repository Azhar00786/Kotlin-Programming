package oops_concept_in_kotlin

/*
    *   Let’s say we’re running a library where you can lend books and also some movies.
        We want to write an application to keep track of our inventory.

        Create an interface Lendable that defines a borrow() method.
        Then create an abstract class InventoryItem and two classes Book and DVD which inherit from InventoryItem.
        InventoryItem should implement the Lendable interface.
        Books and DVDs both have a title, genre and publication year.
        Books also have an author whereas DVDs have a length in seconds. Add each property to the most suitable class.
 */
interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title: String,
                             val genre: String,
                             var publicationYear: Int,
                             var borrowed: Boolean) : Lendable {

    override fun borrow() {
        if (!borrowed) {
            borrowed = true
        } else {
            println("This item is already borrowed.")
        }
    }

    override fun toString(): String {
        return "InventoryItem(title='$title', genre='$genre', publicationYear=$publicationYear, borrowed=$borrowed)"
    }

    abstract fun copy(): InventoryItem

}

class LibraryBook(title: String,
                  val author: String,
                  genre: String,
                  publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun read() {
        println("Reading a book by $author...")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryBook(title, author, genre, publicationYear)
        copy.borrowed = this.borrowed

        return copy
    }
}

class LibraryDVD(title: String,
                 genre: String,
                 val length: Int,
                 publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {

    fun watch() {
        println("Watching $title...")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryDVD(title, genre, length, publicationYear)
        copy.borrowed = this.borrowed

        return copy
    }
}