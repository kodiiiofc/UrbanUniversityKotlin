package functionsreturningvalues

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13, 15, 33),
        arrayOf(2, 10, 6, 8, 72),
        arrayOf(66, 45, 1, 4, 90),
        arrayOf(2, 130, 36, 68, 725),
        arrayOf(65324, 47, 131, 712, 390)

    )

    val k = 4

    printRowOfMatrix(k, matrix)

}

fun<T> printRowOfMatrix(numberOfRow: Int, matrix: Array<Array<T>>) {
    println(matrix[numberOfRow].contentDeepToString())
}