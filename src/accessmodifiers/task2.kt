package accessmodifiers

val matrix = arrayOf(
    arrayOf(4, 3, 13, 4),
    arrayOf(2, 10, 6, 73),
    arrayOf(66, 45, 1, 12),
    arrayOf(36, 438, 4, 65),
)

fun main() {

    val onlyEvenOfMatrix = findEvenNumbersInMatrix(matrix)
    println(onlyEvenOfMatrix.toString())



}

fun findEvenNumbersInMatrix(matrix: Array<Array<Int>>) : ArrayList<Int> {

    fun isEven(number: Int) = number % 2 == 0

    val arrayEven : ArrayList<Int> = ArrayList<Int>()
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            if (isEven(matrix[i][j])) arrayEven.add(matrix[i][j])
        }
    }
    return arrayEven
}




