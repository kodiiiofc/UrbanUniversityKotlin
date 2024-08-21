package gettingpartofcollections

fun main() {

    val list = listOf("one", "two", "three")

    val result = list.map { it.toCharArray().toList() }.flatten()

    println("Исходный список: $list")
    println("Результат работы программы: $result")

}