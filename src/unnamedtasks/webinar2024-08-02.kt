package unnamedtasks

fun main() {
    var c = 3
    val summa: (Int) -> Int = { it * it + c }
    val sum = fun(a: Int): Int = a * a + c

    println(sum(2))
    println(summa(2))

    c = 4

    println(sum(2))
    println(summa(2))
}