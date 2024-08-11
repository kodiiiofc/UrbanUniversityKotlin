package extensions

fun main() {
    val stringOne = "Привет"
    val stringTwo = "Мир"
    println(stringOne.concat(stringTwo))

}

fun String.concat(s: String) = this + s