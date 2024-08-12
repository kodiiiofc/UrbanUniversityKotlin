package scopefunctions

fun main() {
    val array: Array<Int> = arrayOf(6,3,-3,6,2,-7,41,5,-67,11,2,31)

    with(array) {
        println("Элементы массива: ${contentToString()}")
        println("Количество элементов массива = $size")
        println("Сумма элементов массива = ${sum()}")
    }

}