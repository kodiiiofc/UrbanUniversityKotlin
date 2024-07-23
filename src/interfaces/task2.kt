package interfaces

import kotlin.math.abs

fun main() {
    val a = 620
    val b = 40

    println(greatestCommonDivisor(a, b))
}

fun greatestCommonDivisor(number1 : Int, number2 : Int) : Int {
    var a = number1
    var b = number2

    while (a != b) {
        if (a == 0 || b == 0) {         // возвращаем ненулевое число, если хотя бы один из членов равен нулю
            a = abs(a - b)
            break
        }
        if (a > b) {                    // последовательно уменьшаем большее число на величину меньшего до их равенства
            a = a - b
        } else b = b - a
    }

    return a                       // возвращаем результат поиска наибольшего общего делителя
}