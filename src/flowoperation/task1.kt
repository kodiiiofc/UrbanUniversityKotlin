package flowoperation

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce

suspend fun main() {
    val list = listOf(1, 13, 123, 66, 30, 36, 95, 543)
    val listAsFlow = list.asFlow()

    println("Исходнный список: $list")

    val result = listAsFlow.reduce {a, b -> a + b * b}
    println(result)



}