package infixfunctions

fun main() {

    val loki = Person("Крестьянин")

    loki say "Готов вкалывать!"

}

class Person(val name: String) {

    infix fun say(message: String) = println("Person $name says: \"$message\"")

}