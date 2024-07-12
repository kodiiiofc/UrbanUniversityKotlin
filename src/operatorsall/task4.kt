package operatorsall

fun main() {
    val n : Int = 2
    var isPrime : Boolean = true
    if (n > 2) {
        for (i in 2..n / 2 + 1) {
            if (n % i == 0) {
                isPrime = false
                break
            }
        }
    }
    println(if (isPrime) "Число $n простое" else "Число $n не является простым")
}