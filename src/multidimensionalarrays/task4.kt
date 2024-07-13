package multidimensionalarrays

fun main() {
    val matrix = arrayOf(
        arrayOf(4, 3, 13, 15, 33),
        arrayOf(2, 10, 6, 8, 72),
        arrayOf(66, 45, 1, 4, 90)
    )

    val secondMin : Int
    val indexOflastRow = matrix.size - 1
    val indexOfSecondToLastElement = matrix[indexOflastRow].size - 2 // индекс предпоследний элемент последней строки


    toSort(matrix) // сортируем по возрастанию методом из задачи номер 2

    secondMin = matrix[indexOflastRow][indexOfSecondToLastElement] // выбор предпоследнего элемента массива

    println(secondMin)
}