package typeconversion

fun main() {
    val stroke = "12.3"

    val double = stroke.toDouble()

    val integer = double.toInt()

    val binary = integer.toString(2)

    println(integer)

    println(double)

    println(binary)
}