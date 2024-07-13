package multidimensionalarrays

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13, 15, 33),
        arrayOf(2, 10, 6, 8, 72),
        arrayOf(66, 45, 1, 4, 90)
    )

    println(matrix.contentDeepToString())

    // сортируем массивы

    toSort(matrix)

    println(matrix.contentDeepToString())

    // находим медиану отсортированного списка из нечетного количества столбцов и строк (для четного количества НЕ справедливо)

    val sizeOfMatrix = matrix.size * matrix[0].size
    var rowOfMedian = sizeOfMatrix / (2 * matrix[0].size)
    var columnOfMedian = sizeOfMatrix / (2 * matrix.size)
    val median = matrix[rowOfMedian][columnOfMedian]

    println(median)

}

//"Пузырьковая" сортировка

fun toSort(matrix: Array<Array<Int>>) {
    var temp: Int

    for (row in matrix) {
        for (j in 0 until row.size) {
            for (rowSort in matrix) {
                for (i in 0 until rowSort.size) {
                    if (row[j] < rowSort[i]) {      // "<" для сортировки по возрастанию
                        temp = rowSort[i]
                        rowSort[i] = row[j]
                        row[j] = temp

                    }
                }
            }
        }
    }
}