package operatorif

fun main() {
    println(getDayOfWeek(5))

}

fun getDayOfWeek(number: Int) : String {
    return if (number == 1) {
        "Понедельник"
    } else if (number == 2) {
        "Вторник"
    } else if (number == 3) {
        "Среда"
    } else if (number == 4) {
        "Четверг"
    } else if (number == 5) {
        "Пятница"
    } else if (number == 6) {
        "Суббота"
    } else if (number == 7) {
        "Воскресенье"
    } else {
        "Ошибка"
    }
}