package anonymousfunctions

fun main() {
    val array = arrayOf(33, 5432, 32, 77, 23, 111, 210)

    val isEven = fun (number: Int) : Boolean = number % 2 == 0

    println(array.contentToString())

    println(checkArrayElement(array, isEven).contentToString())



}

fun checkArrayElement(array: Array<Int>, condition: (Int) -> Boolean): Array<Int> {
    var result: Array<Int> = arrayOf()
    for (number in array) {
        if (condition(number)) result += number
    }
    return result
}