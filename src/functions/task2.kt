package functions

fun main() {
    println(multiplyBetween(2, 6))
}

fun multiplyBetween(from: Int, to: Int): Int {
    var result = 1
    for (i in from..to) {
        result *= i
    }
    return result
}