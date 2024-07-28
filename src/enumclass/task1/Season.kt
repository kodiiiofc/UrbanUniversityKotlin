package enumclass.task1

enum class Season(val season: String, val months: Array<Month>) {
    WINTER("Зима", arrayOf(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY)),
    SPRING("Весна", arrayOf(Month.MARCH,Month.APRIL,Month.MAY)),
    SUMMER("Лето", arrayOf(Month.JUNE,Month.JULY,Month.AUGUST)),
    AUTUMN("Осень", arrayOf(Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER)),
    NULL("Такого месяца не существует", arrayOf())
}