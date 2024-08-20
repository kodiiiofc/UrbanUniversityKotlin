package sorting

fun main() {
    val matrix = arrayOf(
        arrayOf(13, 13, 512, 63),
        arrayOf(450, 313, 55, 71),
        arrayOf(13, 336, 1, 32),
    )

    matrix.forEach { it.sort() }

    println(matrix.contentDeepToString())
}