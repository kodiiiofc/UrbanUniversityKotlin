package plusminuszipcollections

fun main() {
    val list = listOf("one", "two", "three")

    val result = list.map { it.reversed() }

    println("Исходный список: $list")
    println("Результат работы программы: $result")


}