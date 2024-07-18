package accessmodifiers

fun main() {
    val matrix = Array<Array<Int>>(4){Array<Int>(4) {0}}

    println(matrix.contentDeepToString())

    fillBySize(matrix)

    println(matrix.contentDeepToString())


}

fun fillBySize(matrix: Array<Array<Int>>) {
    var counter = 1
    for (i in matrix.indices) {
        for (j in matrix[0].indices) matrix[i][j] = counter++
    }
}