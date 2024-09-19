package flowoperation

import kotlinx.coroutines.flow.*

val list = listOf(
    Person("Alex", 23),
    Person("Dmitry", 21),
    Person("Sergey", 33),
    Person("Daria", 28),
    Person("Roman", 27),
    Person("Ilya", 32),
    Person("Maria", 37),
    Person("Max", 45),
    Person("Kate", 36),
    Person("Anastasia", 30),
)

suspend fun main() {
    println("Введите первую букву имени")
    val first = readln().first()
    println("Введите возраст человека")
    var age = readln()
    while (!age.matches("\\d+".toRegex())) {
        println("Введите число")
        age = readln()
    }
    println(list.asFlow().getPerson(first, age.toInt()))
}

data class Person(val name: String, val age: Int)

suspend fun Flow<Person>.getPerson(first: Char, age: Int) : Person {

    return this.filter { person ->
        person.name.first() == first && person.age == age }.first()
}