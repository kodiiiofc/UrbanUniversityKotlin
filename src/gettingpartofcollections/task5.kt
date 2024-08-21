package gettingpartofcollections

fun main() {
    val list = listOf(
        Product("Яблоки", 30),
        Product("Орехи", 98),
        Product("Груши", 1),
        Product("Кола", 6),
        Product("Хлеб", 13),
    )

    val result = list.fold(0) {sum, product -> sum + product.count}

    println("Исходный список: $list")
    println("Результат работы программы: $result")
}

data class Product(val name: String, var count: Int)