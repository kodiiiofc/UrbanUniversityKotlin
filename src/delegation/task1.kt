package delegation

fun main() {
    println(toBinary(123))
}

fun toBinary(n: Int) : String {
    var s: StringBuilder = StringBuilder()
    var currentNumber = n
    while (currentNumber != 0) {
        s.append(currentNumber % 2)
        currentNumber /= 2
    }
    return s.reverse().toString()
}