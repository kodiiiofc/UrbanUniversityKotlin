package file

import java.io.File

fun main() {
    val path = "./res/"
    val fileName = "txtfile.txt"
    val n = 213

    val file = File(path + fileName)
    repeat(n) {
        if (it > 0 && it % 2 == 0) {
            file.appendText(it.toString() + "\n")
        }
    }

}