package channels

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val time = measureTimeMillis {
        var stringResult = ""
        coroutineScope {
            val channel = getList(toStringList(Storage().text))
            channel.consumeEach {
                stringResult += it + "\n"
            }
            println(stringResult)
        }
    }
    println("Затрачено времени на получение данных: $time")

}

fun toStringList(string: String): List<String> = string.lines()

fun CoroutineScope.getList(list: List<String>) : ReceiveChannel<String> = produce {
    for (string in list) {
        delay(10L)
        this.send(string)
    }
    this.close()
}