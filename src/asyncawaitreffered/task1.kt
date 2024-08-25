package asyncawaitreffered

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val charList = getRandomList(10, '!'..'~')
        val intList = getRandomList(10, 1..200)

        val unpackingCharList = async { unpack(charList) }
        val unpackingIntList = async { unpack(intList) }

        println("Общий размер списка: ${unpackingCharList.await() + unpackingIntList.await()}")

        println(concatenate(charList, intList))
    }
    println("Общее время работы программы: $time мс")
}

suspend fun <T> unpack(list: MutableList<T>): Int {
    var counter = 0
    list.forEach {
        counter += 1
        println(it)
        delay(1000)
    }
    return counter
}


fun getRandomList(size: Int, range: IntRange): MutableList<Int> {
    val result: MutableList<Int> = mutableListOf()
    for (i in 1..size) {
        result.add(range.random())
    }
    return result
}

fun getRandomList(size: Int, charRange: CharRange): MutableList<Char> {

    val result: MutableList<Char> = mutableListOf()
    for (i in 1..size) {
        result.add(charRange.random())
    }
    return result
}

fun concatenate(vararg lists: MutableList<*>): Pair<Int, MutableList<*>> {
    val resultList = lists.toList().flatten().toMutableList()
    return Pair(resultList.size, resultList)
}