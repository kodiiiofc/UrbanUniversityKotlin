package lambdaexpressions

fun main() {
    val lambda: (Array<Int>) -> Array<Int> = {array ->
        for ((i, n) in array.withIndex()) {
            if (i % 2 == 0) array[i] = n / 2
            else array[i] = n * 3
        }
        array
    }

    val array = arrayOf(1, 2, 3, 5, -6, 8, 72, -3)

    println(lambda(array).contentToString())
}