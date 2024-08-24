package launchjobrunblocking

import kotlinx.coroutines.*

fun main() = runBlocking {
    val lazyJob = launch(start = CoroutineStart.LAZY) {
        println("Произошел ленивый запуск")
    }

    val fin = launch(start = CoroutineStart.LAZY) {
        println("Программа завершена")
    }

    println("Начало программы")
    launch {
        for (i in 1..4) {
            delay(1000)
            println(i)
            if (i == 2) lazyJob.start()
        }
        fin.start()
    }
    Unit
}