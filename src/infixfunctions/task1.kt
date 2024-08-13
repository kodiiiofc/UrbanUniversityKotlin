package infixfunctions

fun main() {
    println(3 plus 4)
    println(13 minus 10)
    println(2 times 10)
    println(10 divide 5)
    println(7 divide 0)
}

infix fun Int.plus(value: Int) = this + value

infix fun Int.minus(value: Int) = this - value

infix fun Int.times(value: Int) = this * value

infix fun Int.divide(value: Int): Int {
    try {
        return this / value
    } catch (e: ArithmeticException) {
        println("На ноль делить нельзя")
        return 0
    }
}