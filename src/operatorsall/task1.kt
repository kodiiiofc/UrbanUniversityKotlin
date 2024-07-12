package operatorsall

fun main() {
    val n = 533
    var sum : Double = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println(sum)
}