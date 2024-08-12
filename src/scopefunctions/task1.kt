package scopefunctions

fun main() {
    val line = "Привет, Мир!"
    line.let { println("Строка \"$it\" содежит ${it.length} символов.") }
}