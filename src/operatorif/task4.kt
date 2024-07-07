package operatorif

val dayOfWeek = mapOf(1 to "Понедельник", 2 to "Вторник", 3 to "Среда", 4 to "Четверг", 5 to "Пятница", 6 to "Суббота", 7 to "Воскресенье")

fun main() {
    println(getDayOfWeek(5))

}

fun getDayOfWeek(number: Int) : String {
    if (number < 1 || number > 7) {
        return "ошибка"
    } else {
        return dayOfWeek.getValue(number)
    }
}