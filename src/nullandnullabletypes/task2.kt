package nullandnullabletypes

fun main() {
    println(divideIfWhole(125, 5))

    println(divideIfWhole(127, 5))

    println(divideIfWholeNotNull(127, 5))



}

fun divideIfWhole(dividend: Int, divisor: Int): Int? {
    return log(dividend, divisor)

}

fun divideIfWholeNotNull(dividend: Int, divisor: Int): Int {
    return log(dividend, divisor) ?: 0

}

fun log(x: Int, base: Int) : Int? {
    var result = 0
    var xVar = x
    while (xVar % base == 0) {
        result++
        xVar /= base
    }

    return if (result == 0) null else result
}