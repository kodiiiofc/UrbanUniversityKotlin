package operatorsall

fun main() {
    val a : Int = 2
    val b : Int = 31
    var sumSquares : Int = 0
    for (i in a .. b) {
        sumSquares += i * i
    }
    println(sumSquares)
}