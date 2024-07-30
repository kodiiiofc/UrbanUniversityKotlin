package delegation

fun main() {
    val s: String = "10101010"
    println(toDecimal(s))
}


fun pow(n: Int, i: Int): Int {
    var result = 1
    repeat(i) { result *= n }
    return result
}


fun toDecimal(s: String) : Long {
    var result = 0L
    for (i in 0..s.length - 1) {
        val currentDigit = s[s.length - 1 - i].digitToInt()
        result += pow(2,i) * currentDigit
    }
    return result
}

