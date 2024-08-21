package aggregateoperations

fun main() {
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "кокос", "яблоко")

    val mutableMap = fruits
        .groupBy ({it[0].lowercase()}, {if (it.length % 2 == 0) it else null})
        .toMutableMap()

    for (entry in mutableMap.entries) {
        mutableMap[entry.key] = entry.value.filterNotNull()
    }

    val result = mutableMap.toMap()

    println(result)

    // Разобрать задачу на вебинаре

    /*
    Вариант до которого я не додумался...

        val result = fruits
        .groupBy ({it[0].lowercase()})
        .mapValues { it.value.filter { it.length % 2 == 0 } }

     */

}