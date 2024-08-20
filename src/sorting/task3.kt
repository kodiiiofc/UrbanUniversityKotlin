package sorting

fun main() {
    val matrix = arrayOf(
        arrayOf(13, 13, 512, 63),
        arrayOf(450, 313, 55, 71),
        arrayOf(13, 336, 1, 32),
    )

    println("Исходная матрица: ${matrix.contentDeepToString()}")

    var counter = 0

    matrix.forEach {
        if (isSaw(it)) {
            counter++
            println(it.contentToString())
        }
    }

    println("Всего пилообразных массивов в матрице: $counter")

}

fun isSaw(array: Array<Int>): Boolean {

    for ((index, value) in array.withIndex()) {
        array.forEachIndexed { i, v -> if (index != i && value == v) return false }
    }

    return true
}