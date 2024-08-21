package gettingpartofcollections

fun main() {
    val list = listOf("Александр", "Роман", "Дмитрий", "Анастасия", "Андрей", "Татьяна", "Екатерина")

    val result = list.maxByOrNull {it.length}

    println("Исходный список: $list")
    println("Результат работы программы: $result")

}