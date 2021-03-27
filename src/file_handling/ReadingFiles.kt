package file_handling

import java.io.File

fun main(args: Array<String>) {
    var lineNumber = 0
    File("src/inputfile").forEachLine {
        ++lineNumber
        println("$lineNumber : $it")
    }
}