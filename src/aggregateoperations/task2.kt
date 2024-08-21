package aggregateoperations

fun main() {
    val numbers = listOf(1, 2, 3, 4)

    println(numbers.fold(""){string, number -> string + number})
}