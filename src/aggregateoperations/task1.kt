package aggregateoperations

fun main() {

    val array = arrayOf(1, 2, 3, 5, 6, 8, 72, 3, 13, 677, 43, 123)

    val sum = array.foldIndexed(0) {i, sum, v ->
        if (i in 3..9) sum + v else sum}

    println(sum)

}