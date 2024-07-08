package operatorwhen

fun main() {
    var hours : Int = 231
    var minutes : Int = 5665
    getTime(hours, minutes)

}

fun getTime(hours: Int, minutes: Int) {
    var time : Int = (hours % 24 * 60 + minutes) % (24*60)              //задаем время в сутках в минутах, а также исключаем ошибку задания более 24 часов в сутках и более 60 минут в часе
    time = if (time < 0) 0 else time                                    // исключаем отрицательное время
    println("Сейчас " + time / 60 + ":" + (if (time % 60 < 10) "0" + time % 60 else + (time % 60)) + " - " + // форматируем минуты к виду mm вместо m
            when (time) {                                                                                       // перебираем название времени суток
                in 0..3*60 - 1 -> "Ночь"
                in 3*60 ..5*60 - 1 -> "Ранее утро"
                in 5*60..11*60 - 1 -> "Утро"
                in 12*60..17*60 - 1 -> "День"
                in 17*60..21*60-1 -> "Вечер"
                in 21*60..24*60-1 -> "Поздний вечер"
                else -> "В суток только 24 часа"
            })
}