package extensions

fun main() {
    val a = 5
    val b = 13

    println(a.square())

    println(b.square())
}

fun Int.square() = this * this