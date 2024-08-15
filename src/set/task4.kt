package set

fun main() {

    val array = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)

    var numbers: Array<Int> = arrayOf()
    var zeros: Array<Int> = arrayOf()

    array.forEach { if (it == 0) zeros += it else numbers += it }

    val result = numbers + zeros

    println("Исходный массив: ${array.contentToString()}")
    println("Результат работы программы: ${result.contentToString()}")

}