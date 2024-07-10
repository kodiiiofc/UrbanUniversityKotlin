package operatorfor

fun main() {
    val a: Int = 31
    val b: Int = 6
    val min: Int
    val max: Int

    println("Среднее арифметическое $a и $b равно ${(a + b) / 2}") // математический способ
    println("-----------------------------------------------------------------------")

// далее код получения среднего арифметического при помощи цикла for, тема все таки такая :)

    if (a < b) {
        min = a
        max = b
    } else {
        min = b
        max = a
    }

    var j = max
    for (i in min..max) {
        if (i >= j) {
            println("Среднее арфиметическое равно, посчитанное при помощи цикла for равно $j")
            break
        }
        j--
    }
}