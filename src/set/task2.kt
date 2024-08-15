package set

fun main() {
    val set = setOf(1, 2, 3, 5, 6, 40, 73215, 3)

    val result : MutableSet<Int> = mutableSetOf()

    for (number in set) {
        if (number % 5 == 0) result += number * 2
    }

    println("Исходный набор: $set")

    println("Результат программы: $result")

}