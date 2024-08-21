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

}