package classconstructors

fun main() {
    println(whatIsNumber(12))
    println(whatIsNumber(655))
    println(whatIsNumber(-13))
    println(whatIsNumber(-2))
}

fun whatIsNumber(number: Int): String {
    val s1: String
    val s2: String
    val s3 = "число"
    when {
        number < 0 -> s1 = "отрицательное"
        number > 0 -> s1 = "положительное"
        else -> s1 = "нулевое"
    }

    when {
        number == 0 -> s2 = ""
        number % 2 == 0 -> s2 = "четное"
        else -> s2 = "нечетное"
    }
    return "$s1 $s2 $s3"
}