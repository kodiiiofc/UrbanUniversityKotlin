package plusminuszipcollections

fun main() {

    val listOne = listOf("red", "blue", "white")
    val listTwo = listOf("красный", "синий", "белый")

    val result = listOne.zip(listTwo) {en, ru ->
        "Значение: $en, перевод: $ru"
    }

    println("Исходный список один: $listOne")
    println("Исходный список два: $listOne")
    println("Результат работы программы: $result")

}