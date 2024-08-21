package plusminuszipcollections

fun main() {

    val list = listOf("Jan", "Feb", "Mar", "Apr", "May")

    val result = list.fold(0){sum: Int, s2: String -> sum + s2.length}

    println("Исходный список: $list")
    println("Результат работы программы: $result")

}