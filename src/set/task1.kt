package set

fun main() {
    val set = setOf(1, 2, 3, 5, 6, 8, 72, 3)
    val onlyEvenOfSet = set.filter { it % 2 == 0 }
    val onlyOddOfSet = set subtract onlyEvenOfSet

    println("Исходный набор: $set")

    println("Четные числа: $onlyEvenOfSet")

    println("Нечетные числа: $onlyOddOfSet")

}