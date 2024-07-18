package accessmodifiers

fun main() {
    printEvenNumbersInMatrix(matrix)
}

fun printEvenNumbersInMatrix(matrix: Array<Array<Int>>) {

    fun isEven(number: Int) = number % 2 == 0

    for (i in matrix.indices) {
        for (j in matrix[0].indices) if (isEven(matrix[i][j])) println(matrix[i][j])
    }
}