package operatorif

val grades = mapOf(1 to "плохо", 2 to "неудовлетворительно", 3 to "удовлетворительно", 4 to "хорошо", 5 to "отлично")

fun main() {
    println(grade(4))

}

fun grade(number: Int) : String {
    try {
        return grades.getValue(number)
    }
    catch (e: Exception) {
        return "ошибка"
    }
}