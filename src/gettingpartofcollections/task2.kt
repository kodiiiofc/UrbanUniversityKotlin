package gettingpartofcollections

fun main() {
    val list = (1..20).toList()

    val result = list.take(7)
        .sum()

    println("Исходный список: $list")
    println("Результат работы программы: $result")

}