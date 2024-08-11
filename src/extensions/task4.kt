package extensions

fun main() {
    val number = 125

    val numberTwo = 25

    println(number.sqrt())

    println(numberTwo.sqrt())
}

fun Int.sqrt() = Math.sqrt(this.toDouble())