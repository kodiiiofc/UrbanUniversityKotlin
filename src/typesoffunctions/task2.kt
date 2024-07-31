package typesoffunctions

fun main() {
    println(powTenTo(0))

    println(powTenTo(3))

    println(powTenTo(-2))
}

fun powTenTo(n: Int): Double {
    if (n == 0) return 1.0
    if (n > 1) {
        val pow = n - 1
        return 10 * powTenTo(pow)
    }
    if (n < 1) {
        val pow = n + 1
        return powTenTo(pow) / 10
    }
    return n.toDouble()
}