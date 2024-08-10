package typeconversion

fun main() {
    println("15: ${funOne(15)}\n---")

    println(("\"Строка\": ${funOne("Строка")}\n---"))

    println("Массив [1, 2, 2, 5]: ${funOne(arrayOf(1, 2, 2, 5))}\n---")

    println("Массив [231.3, 10.0]: ${funOne(arrayOf(231.3, 10.0))}\n---")

    println("Массив [10L, 13, 13.33]: ${funOne(arrayOf(10L, 13, 13.33))}\n---")

    println("Массив [1L, 2L]: ${funOne(arrayOf(1L, 2L))}\n---")

    println("13.0: ${funOne(13.0)}\n---")

    println("31231L: ${funOne(31231L)}\n---")

    println("true: ${funOne(true)}\n---")

    println("'d': ${funOne('d')}\n---")

    println("Массив [\"буква\", 'd', 13.33, 2]: ${funOne(arrayOf("буква", 'd', 13.33, 2))}\n---")

    println("'\\u00b3': ${funOne('\u00b3')}")

}

fun <T> funOne(input: T): Double? {

    fun <V> funForArray(array: Array<V>): Double {      // Функция в котором, получаем массив с любым значениями
        var counter = 0.0                               // если в массиве есть числа, то они складываются
        for (number in array) {                         // элементы не являющиеся числами пропускаются
            val value = number as? Number ?: 0.0        // к сожалению, при обращении к массиву чисел как Array<Number>
            counter += value.toDouble()                 // не обрабатываются массивы с разными типами чисел внутри
        }                                               // и возвращается значение null по ветке else
        return counter
    }

    return when {
        input as? Array<*> != null -> funForArray(input)
        input is Number -> input.toDouble() + 1.0
        input is String -> (input.length + 1).toDouble()
        else -> null
    }

}

// Ниже реализация функции строго по заданию

fun <T> funTwo(input: T): Int {
    return when {
        input as? Array<Int> != null -> input.sum()
        input is Int -> input + 1
        input is String -> input.length + 1
        else -> 0
    }
}