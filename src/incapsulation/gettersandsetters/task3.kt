package incapsulation.gettersandsetters

fun main() {
    var a = 82
    var b = swapDigit(a)

    println("$a -> $b")

    var c = 50
    var d = swapDigit(c)

    println("$c -> $d")

}

fun swapDigit(n : Int) = n % 10 * 10 + n / 10 // только для двузначных чисел