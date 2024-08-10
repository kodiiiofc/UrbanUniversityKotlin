package typeconversion

fun main() {
    println(checkType("Три"))

    println(checkType(3))

    println(checkType(3.0))

    println(checkType('\u00B3'))

}

fun <T> checkType(input: T): String {
    return when (input) {
        is Int -> "Это целое число"
        is Double -> "Это число с плавающей точкой"
        is Char -> "Это символ"
        else -> "Это строка"
    }

}