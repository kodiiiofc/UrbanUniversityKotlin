package classconstructors

fun main() {
    val numbers = arrayOf(5, 3, 31, 3, 5, 13)
    val minimum = getMin(numbers)
    val maximum = getMax(numbers)

    println(minimum)
    println(maximum)

}

fun getMin(numbers: Array<Int>): Int {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) min = number
    }
    return min
}

fun getMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) max = number
    }
    return max
}