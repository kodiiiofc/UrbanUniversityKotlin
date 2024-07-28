package enumclass.task1

fun main() {
    loop@ while (true) {
        var month = Month.NULL
        var season = Season.NULL

        println("Пожалуйста, введите месяц:")

        val monthString = readln()
        for (currentMonth in Month.values()) {  // определяем месяц
            if (monthString.lowercase() == currentMonth.month.lowercase()) {
                month = currentMonth;
            }
        }

        for (currentSeason in Season.values()) {  // определяем к какому сезону относится месяц
            if (month in currentSeason.months) {
                season = currentSeason
                break
            }
        }

        println(season.season)
        println()

        println("Желаете продолжить (1) или закончить (2) программу:")  // запрашиваем продолжение программы
        while (true) {
            val answer = readln().toInt()
            if (answer == 1) break
            else if (answer == 2) break@loop
            else println("Введите 1 или 2")
        }

    }

}