package functions

import java.util.TreeSet

fun main() {
    val a = -63
    val b = 15
    val c = 321
    println(getSetOfDivisors(a))
    println(getSetOfDivisors(b))
    println(getSetOfDivisors(c))
    print("Общий делитель: ${greatestCommonDivisor(a, b, c)}")
}

fun greatestCommonDivisor(vararg numbers: Int): Int {
    var temp: Set<Int>
    temp = getSetOfDivisors(numbers[0])
    for (number in numbers) {
        temp = temp.intersect(getSetOfDivisors(number))
    }

    return temp.max()

}

fun getSetOfDivisors(a: Int): TreeSet<Int> {
    var temp = a
    var i = 2

    val set = TreeSet<Int>()

    set.add(1)

    while (temp > 1) {          // поиск делителей для положительного числа
        while (temp % i == 0) {
            temp /= i
            set.add(i)
        }
        i++
    }

    while (temp < -1) {         // поиск делителей для отрицательного числа
        while (temp % i == 0) {
            temp /= i
            set.add(i)
        }
        i++
    }


    return set
}