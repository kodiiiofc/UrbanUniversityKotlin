package whiledowhile

fun main() {
    val number: Int = readln().toInt()
    var i: Int = 1
    var result: Int = i
    while (i++ < number) result *= i
    println(result)
}