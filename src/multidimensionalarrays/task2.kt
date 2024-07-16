package multidimensionalarrays

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13, 15, 33),
        arrayOf(2, 10, 6, 8, 72),
        arrayOf(66, 45, 1, 4, 90),
        arrayOf(66, 45, 1, 4, 90)
    )

    println(matrix.contentDeepToString())

    // сортируем массивы

    toSort(matrix)

    println(matrix.contentDeepToString())

    print(matrix)

    // находим медиану отсортированного списка

    val lastColumn = matrix[0].size - 1
    val lastRow = matrix.size - 1
    val median: Int

    val firstRowIndexOfMedian: Int = lastRow / 2
    val firstColumnIndexOfMedian: Int = lastColumn / 2

    val secondRowIndexOfMedian: Int = if (lastRow % 2 != 0) firstRowIndexOfMedian + 1 else firstColumnIndexOfMedian
    val secondColumnIndexOfMedian: Int = if (lastColumn % 2 != 0) firstColumnIndexOfMedian + 1 else firstColumnIndexOfMedian

    val value1 = matrix[firstRowIndexOfMedian][firstColumnIndexOfMedian]
    val value2 = matrix[firstRowIndexOfMedian][secondColumnIndexOfMedian]
    val value3 = matrix[secondRowIndexOfMedian][firstColumnIndexOfMedian]
    val value4 = matrix[secondRowIndexOfMedian][secondColumnIndexOfMedian]

    median = (value1 + value2 + value3 + value4) / 4


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


fun print(matrix : Array<Array<Int>>) {
    for (row in matrix) {
        for (element in row)
            print(" $element")
        println()
    }

}
