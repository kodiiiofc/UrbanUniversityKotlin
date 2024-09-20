package file

import java.io.File

fun main() {
    val path = "./res/"
    val fileName = "txtfile.txt"

    val file = File(path + fileName)

    val list = file.bufferedReader().readLines()
    val result = list.take(2) + list.takeLast(2)

    println(result)

}