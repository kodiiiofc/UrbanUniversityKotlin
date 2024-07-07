package operatorif

fun main() {
    val numbers : Array<Int> = arrayOf(4, 45, -2, 8)
    var counter = 0
    for (number in numbers) {
        if (number > 0) {
            counter++
        }
    }
    println(counter)
}