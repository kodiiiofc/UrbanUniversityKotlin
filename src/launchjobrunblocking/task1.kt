package launchjobrunblocking

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    try {
        println("Программа покупки продуктов")
        delay(1000)
        println("Купить товар:\n1.Да\n2.Нет")
        val answer = readln()
        when (answer) {
            "Да" -> buy()
            "Нет" -> cancelBuy()
            else -> throw Exception("Ошибка ввода данных!")
        }
    } finally {
        println("До свидания")
    }

    Unit
}

suspend fun buy() = coroutineScope {
    launch {
        println("Оплата продукта началась")
        delay(2000)
        println("Сканирование и обработка")
        delay(2000)
        println("Покупка оплачена.")
    }
}

suspend fun cancelBuy() = coroutineScope {
    launch {
        println("Отмена покупки...")
        delay(2000)
        println("Покупка отменена.")
    }
}