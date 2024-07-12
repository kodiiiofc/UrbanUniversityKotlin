package operatorsall

fun main() {
    val question : String = "Загадка: Синий, большой, с усами и полностью набит зайцами. Что это такое?"
    val answer : String = "троллейбус"
    val givingUp : String = "сдаюсь"
    val rightAnswer : String = "Правильно!"
    val showAnswer : String = "Правильный ответ: троллейбус."
    val oneMoreTry : String = "Подумай еще."

    println(question)
    for (i in 1..3) {
        var currentAnswer : String = readln().lowercase()
        if (currentAnswer == answer) {
            println(rightAnswer)
            return
        }
        if (currentAnswer == givingUp || i == 3) break
        println(oneMoreTry)
    }
    println(showAnswer)

}