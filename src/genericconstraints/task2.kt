package genericconstraints

import java.time.LocalDate
import java.time.LocalDateTime

fun main() {

    val localDate = LocalDate.of(2024, 8,7)

    val localDateTimeNow = LocalDateTime.now()

    val arrayInt = arrayOf(13, 13, 5, 55)

    val genericMethodObject = GenericMethod()

    val array : Array<Any> = arrayOf(
        19,
        "Привет, Мир!",
        localDate,
        arrayInt,
        5.0,
        100_000_000_000L,
        genericMethodObject,
        localDateTimeNow
    )


    println("19 in array? ${genericMethodObject.isItIncluded(19, array)}")

    println("131 in array? ${ genericMethodObject.isItIncluded(131, array) }")

    println("genericMethodObject in array? ${genericMethodObject.isItIncluded(genericMethodObject, array)}")

    println("LocalDateTime.now() in array? ${genericMethodObject.isItIncluded(LocalDateTime.now(), array)}")

    println("localDateTimeNow in array? ${genericMethodObject.isItIncluded(localDateTimeNow, array)}")

    println("localDate in array? ${genericMethodObject.isItIncluded(localDate, array)}")

    println("LocalDate.now() in array? ${genericMethodObject.isItIncluded(LocalDate.now(), array)}")

    println("\"Привет, Мир!\" in array? ${genericMethodObject.isItIncluded("Привет, Мир!", array)}")

    println("\"Случайная строка\" in array? ${genericMethodObject.isItIncluded("Случайная строка", array)}")

}


class GenericMethod {

    fun <T, V> isItIncluded(obj: V, array: Array<T>): Boolean where V : T {
        return obj in array
    }

}