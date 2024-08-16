package map

fun main() {
    val personHashMap = hashMapOf(
        1 to Person("Иванов Сергей", 68, "Директор"),
        2 to Person("Петров Роман", 27, "Ведущий инженер-проектировщик"),
        3 to Person("Сергеев Илья", 27, "Инженер-проектировщик"),
        4 to Person("Сергеева Ангелина", 27, "Архитектор"),
        5 to Person("Петрова Дарья", 28, "Инженер-проектировщик")
    )

    println(personHashMap)

}

data class Person(val name: String, var age: Int, var position: String)