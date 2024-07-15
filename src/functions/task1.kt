package functions

fun main() {
    println(pow(-3, 3))
}

fun pow(a: Int, n: Int): Int {
    var result = 1
    repeat(n) { result *= a }
    return result
}