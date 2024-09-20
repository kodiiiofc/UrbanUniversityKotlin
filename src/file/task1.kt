package file

import java.io.File

fun main() {

    val file = createTextFile()

    println(readTextFile(file))

}

fun createTextFile() : File {
    println("Введите имя файла:")
    val fileName = readln()
    val file = File("./res/" + fileName + ".txt")
    while (true) {
        println("Добавить данные в файл? (введите 0 - чтобы выйти)")
        val text = readln()
        if (text == "0") break
        file.appendText(text + "\n")
    }
    return file
}

fun readTextFile(file: File) : String {
    return file.readText()
}

