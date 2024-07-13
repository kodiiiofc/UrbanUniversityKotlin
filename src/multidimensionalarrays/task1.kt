package multidimensionalarrays

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13),
        arrayOf(2, 10, 6),
        arrayOf(66, 45, 1)
    )
    var min = matrix[0][0]

    for (row in matrix) {
        for (element in row) {
            if (element < min) min = element
        }
    }

    println(min)

}