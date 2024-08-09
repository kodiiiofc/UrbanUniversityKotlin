package lambdaexpressions

fun main() {

    val average: (Array<Int>) -> Int = {it.sum() / it.size}

    val array = arrayOf(1,2,3,5,6,8,72,3)

    println(average(array))
}