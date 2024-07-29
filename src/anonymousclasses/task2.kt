package anonymousclasses

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13, 15, 0),
        arrayOf(2, 10, 6, 8,3),
        arrayOf(66, 45, 1, 4,13),
        arrayOf(2, 130, 36, 68, 33),
        arrayOf(233, 32110, 66, 318,73),
    )

    println(sumOfSideDiagonal(matrix))

}

fun sumOfSideDiagonal(array: Array<Array<Int>>) : Int {
    var sum = 0
    val matrixYSize = array.size
    var matrixXSize = array[0].size
    for (currentArray in array) {
        if (currentArray.size != matrixXSize || currentArray.size != matrixYSize) {
            println("Матрица не квадратная!")
            return 0
        }
        matrixXSize = currentArray.size
    }
    for (i in array.indices) {
        sum += array[i][array[0].size - 1 - i]
    }
    return sum
}


