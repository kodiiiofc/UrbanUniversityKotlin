package highorderfunctions

fun main() {
    val array = arrayOf(1,2,3,5,6,8,72,3)

    println(array.contentToString())
    println(action(array, ::addOne))
    println(action(array, ::doubleOf))

}

fun addOne(n: Int) = n + 1

fun doubleOf(n: Int) = n * 2

fun action(array: Array<Int>, function: (Int) -> Int) = array.map(function)