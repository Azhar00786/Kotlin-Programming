package oops_concept_in_kotlin

/*
    ProblemStatement: Create a class representing a book.
    Every book has a title, an author, a publication year and is either borrowed or not.
    Choose an appropriate data type for each of these properties.
    A book can be borrowed from you or returned to you.
    In both cases, the borrowed property is updated accordingly.
    Also, a book should be able to print itself to the command line, including its title, author,
    and publication year.
 */

data class Book(var bookTitle: String?, var bookAuthor: String?, var publicationYear: String?, var isBorrowed: Boolean? = false) {
    fun bookBorrowed() {
        isBorrowed = true
    }

    fun bookReturned() {
        isBorrowed = false
    }

    fun printBookDetails(): String {
        return "Book Title:$bookTitle, Book Author: $bookAuthor, Publication Year: $publicationYear, isBorrowed: $isBorrowed"
    }
}

fun main(args: Array<String>) {
    val bookOne = Book("Harry Potter", "Charles Dickens", "2020")
    println(bookOne.printBookDetails())
    bookOne.bookBorrowed()
    println(bookOne.printBookDetails())
    bookOne.bookReturned()
    println(bookOne.printBookDetails())

    val bookTwo = Book("Batman", "DC", "2222")
    println(bookTwo.printBookDetails())
    bookTwo.bookBorrowed()
    println(bookTwo.printBookDetails())
    bookTwo.bookReturned()
    println(bookTwo.printBookDetails())
}