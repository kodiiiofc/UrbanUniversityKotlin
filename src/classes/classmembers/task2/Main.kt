package classes.classmembers.task2

fun main() {
    val cat = Pet()
    cat.type = "Кот"
    cat.name = "Локи"
    cat.weight = 4.6
    println("Домашнее животное: ${cat.type}, Кличка: ${cat.name}, Вес: ${cat.weight}")
}