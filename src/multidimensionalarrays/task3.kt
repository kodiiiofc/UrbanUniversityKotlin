package multidimensionalarrays

fun main() {
    val byte : Byte = 0;
    var matrix: Array<Array<Byte>> = Array (5) {Array(5) {byte}}

    print(matrix)

    for (k in 0 until matrix.size) {
        for (i in k until matrix[0].size - k)
            matrix[matrix.size - 1 - k][matrix[0].size - 1 - i] = 1
    }

    println("-----------")

    print(matrix)





}

fun print(matrix : Array<Array<Byte>>) {
    for (row in matrix) {
        for (element in row)
            print(" $element")
        println()
    }

}

