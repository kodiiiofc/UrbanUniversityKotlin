package interfaces

fun main() {
    val array1 = arrayOf(6213,33,213,352,943,123)
    println(secondMax(array1))

    val array2 = arrayOf(6213,33,6213,352,943,123)
    println(secondMax(array2))

    val array3 = arrayOf(0,0,2,0)
    println(secondMax(array3))

    val array4 = arrayOf(666)
    println(secondMax(array4))

    val array5 = arrayOf(2,3)
    println(secondMax(array5))

}

fun secondMax(array: Array<Int>): Int {
    var max = Int.MIN_VALUE
    var maxIndex = 0
    var secondMax = Int.MIN_VALUE

    if (array.size == 1) {      // возвращаем первое значение, если массив состоит из 1 числа
        return array[0]
    }

    for (i in array.indices) { // ищем максимальное и индекс максимального числа
        if (array[i] > max) {
            max = array[i]
            maxIndex = i
        }
    }

    for (i in array.indices) { // ищем второе максимальное число
        if (array[i] >= secondMax && maxIndex != i) {
            secondMax = array[i]
        }
    }

    return secondMax

}