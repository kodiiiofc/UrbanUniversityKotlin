package genericsclassesandfunctions

fun main() {
    val a: Int = 10
    val b: String = "Hello"
    val c: List<Int> = listOf(10, 16, 3)
    val d = 'f'

    printPuttedIn(a, '{')
    printPuttedIn(b, '[')
    printPuttedIn(c, '"')
    printPuttedIn(d, '(')

}

fun <T> printPuttedIn(obj: T, bracket: Char) {
    var firstSymbol = bracket

    val lastSymbol = when (bracket) { // выбираем вторую скобку
        '(' -> ')'
        '[' -> ']'
        '{' -> '}'
        '<' -> '>'
        '«' -> '»'
        ')' -> {
            firstSymbol = '('
            ')'
        }
        ']' -> {
            firstSymbol = '['
            ']'
        }
        '}' -> {
            firstSymbol = '{'
            '}'
        }
        '>' -> {
            firstSymbol = '<'
            '>'
        }
        '»' -> {
            firstSymbol = '«'
            '»'
        }
        else -> firstSymbol
    }

    println("$firstSymbol$obj$lastSymbol")

}