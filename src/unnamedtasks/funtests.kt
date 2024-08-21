package unnamedtasks

fun main() {

    val string = "1h32m13s"

    val hours = string.parseUntil('h')

    println(hours)

}

fun String.parseUntil(char: Char) : Pair<Int, String> {

    val parsedString = this.substringBefore(char)

    val cuttedString = this.substringAfter(char)


    return if (parsedString == this) Pair(0,this) else Pair(parsedString.toInt(),cuttedString)
}
