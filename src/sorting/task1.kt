package sorting

fun main() {
    val list = listOf(
        Employee("Andrew", 27, 1700),
        Employee("Daria", 37, 2000),
        Employee("Vasiliy", 40, 2500),
        Employee("Ilya", 30, 1800),
        Employee("Victoria", 45, 1000)
    )

    println("Исходный массив:\n$list")
    println()
    println("Отсортированный по имени массив:\n${list.sortedBy { it.name }}")
    println()
    println("Отсортированный по возрасту массив:\n${list.sortedBy { it.age }}")
    println()
    println("Отсортированный по зарплате массив:\n${list.sortedBy { it.salary }}")

}

data class Employee(val name: String, var age: Int, var salary: Int)
