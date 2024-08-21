package gettingpartofcollections

fun main() {
    val list = (1..20).toList()

    val result = list.drop(4)
        .count { it % 2 == 0 }

    println("Исходный список: $list")
    println("Результат работы программы: $result")

}