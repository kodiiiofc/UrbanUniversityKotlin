package operatorwhen

fun main() {
    val numberOfMonth : Int = 10
    println(when (numberOfMonth) {
        1 -> "Зима: Январь"
        2 -> "Зима: Февраль"
        3 -> "Весна: Март"
        4 -> "Весна: Апрель"
        5 -> "Весна: Май"
        6 -> "Лето: Июнь"
        7 -> "Лето: Июль"
        8 -> "Лето: Август"
        9 -> "Осень: Сентябрь"
        10 -> "Осень: Октябрь"
        11 -> "Осень: Ноябрь"
        12 -> "Зима: Декабрь"
        else -> "Такого месяца нет"
    })
}