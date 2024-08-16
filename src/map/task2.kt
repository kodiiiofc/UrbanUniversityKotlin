package map

fun main() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")

    people.removeEntriesWithValue(readln())

    println(people)



}

fun <K> MutableMap<K, String>.removeEntriesWithValue(value: String) {
    val iterator = this.iterator() // создаем итератор для прохода по элементам
    // исходного словаря, чтобы не создавать 2-й словарь

    while (iterator.hasNext()) {
        val currentEntry = iterator.next() // присваиваем следующий элемент из итератора
        if (currentEntry.value == value) iterator.remove()
    // если значение элемента равно введенному значению,
    // то удаляем значение из словаря
    }

}