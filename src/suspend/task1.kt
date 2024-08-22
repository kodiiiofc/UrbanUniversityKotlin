package suspend

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {


    println("Загрузка начата...")

// последовательная "загрузка"

    download(personList)
    download(weatherList)
    download(randoms)


//    параллельная "загрузка"
//    listOf(
//        launch { download(personList) },
//        launch { download(weatherList) },
//        launch { download(randoms) }
//    ).joinAll()

    println("Данные загружены.")

    println("Список personList: $personList")
    println("Список weatherList: $weatherList")
    println("Список randoms: $randoms")

    println("Программа заверешена")


}

data class Person(val name: String, var age: Int)

data class Weather(val city: String, val description: String, val temp: Int)

val personList = listOf(
    Person("Алексей", 24),
    Person("Дмитрий", 30),
    Person("Роман", 27),
    Person("Сергей", 50)
)

val weatherList = listOf(
    Weather("Оренбург", "солнечно", 23),
    Weather("Москва", "пасмурно", 21),
    Weather("Домодедово", "солнечно", 22),
    Weather("Екатеринбург", "гроза", 14),
)

val randomValue = { (1 + (Math.random() * 99)).toInt() }
val randoms = List(10) { randomValue() }


suspend fun <T> download(list: List<T>) = coroutineScope {

    list.forEach {
        delay(1000L)
        println(it)
    }
}