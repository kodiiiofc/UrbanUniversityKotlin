package plusminuszipcollections

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val result = list
        .filter { it <= 3 }
        .map { it * it }

    println("Исходный список: $list")
    println("Результат работы программы: $result")
}