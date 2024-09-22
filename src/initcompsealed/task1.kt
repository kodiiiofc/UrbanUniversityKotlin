package initcompsealed

import kotlinx.coroutines.delay

suspend fun main() {

    Coffee.make()
}


sealed class Coffee {

    interface Drinkable {
        val name: String
        var value: Value
        var sugar: Sugar
    }

    class Americano(
        override val name: String = "Американо",
        override var value: Value = Value(200),
        override var sugar: Sugar = Sugar(0),
    ) : Drinkable

    class Cappuccino(
        override val name: String = "Капучино",
        override var value: Value = Value(200),
        override var sugar: Sugar = Sugar(0),
    ) : Drinkable

    class Latte(
        override val name: String = "Латте",
        override var value: Value = Value(200),
        override var sugar: Sugar = Sugar(0),
    ) : Drinkable

    class Sugar(var count: Int) {
        init {
            (if (count < 0) {
                println("Кубиков сахара не может быть меньше 0")
                count = 0
            })
        }

        override fun toString(): String {
            return count.toString()
        }
    }

    class Value(var value: Int) {
        init {
            when (value) {
                in (Int.MIN_VALUE..<200) -> {
                    println("Минимальный объем 200 мл")
                    value = 200
                }

                in 701..Int.MAX_VALUE -> {
                    println("Максимальный объем 700 мл")
                    value = 700
                }
            }
        }

        override fun toString(): String {
            return value.toString()
        }
    }

    companion object {
        private fun chooseType(): Drinkable {
            println(
                "Выберите напиток:\n" +
                        "1 - Американо;\n" +
                        "2 - Капучино;\n" +
                        "3 - Латте."
            )
            val answer = readln()
            return when (answer) {
                "1" -> Americano()
                "2" -> Cappuccino()
                "3" -> Latte()
                else -> {
                    println("Товар не найден")
                    chooseType()
                }
            }
        }

        private fun chooseValue(): Value {
            println("Укажите объем напитка в мл.")
            val answer = readln()
            val result: Value
            if (answer.contains("\\D+".toRegex())) {
                println("Вы ввели не числовое значение, принят минимальный объем (200 мл).")
                result = Value(200)
            } else {
                result = Value(answer.toInt())
            }
            return result
        }

        private fun addSugar(): Sugar {
            val result: Sugar
            println("Сколько кубиков сахара добавить в напиток?")
            val answer = readln()
            if (answer.contains("\\D+".toRegex())) {
                println("Вы ввели нечисловое значение, принято 0 кубиков сахара")
                result = Sugar(0)
            } else result = Sugar(answer.toInt())
            return result
        }

        private fun selectedMenu(): Drinkable {
            val drink = chooseType()
            drink.value = chooseValue()
            drink.sugar = addSugar()
            return drink
        }

        suspend fun make(): Drinkable {
            val drink = selectedMenu()
            repeat(10) {
                delay(500L)
                println("${(it + 1) * 10} %")
            }
            println("Ваш кофе готов: ${drink.name}, объем: ${drink.value}, кубиков сахара: ${drink.sugar}")
            return drink
        }
    }

}
