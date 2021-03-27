package loops_in_kotlin

//A program for revising basics(Loops,Lists and conditionals)

/*
    Question. Create an array list of your favorite book titles.
    Loop over this list and, if the title contains the letter ‘e’,
    print each character of the name on a new line.
 */
fun main(args: Array<String>) {
    val bookNameArr = arrayListOf<String>("HarryPotter", "LionKing", "Kingsman", "Provensial")

    for (names in bookNameArr) {
        if (names.contains("e")) {
            println("\n")
            for (tempName in names) {
                println(tempName)
            }
        }
    }
}