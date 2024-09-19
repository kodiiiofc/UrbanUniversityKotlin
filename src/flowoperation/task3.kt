package flowoperation

import kotlinx.coroutines.flow.*

val nameList = listOf("Петр", "Николай", "Василий")
val cardList = generateCardList(nameList.size)
val passwordList = generatePasswordList(nameList.size)

suspend fun main() {

    val persons: MutableList<Employee> = mutableListOf()

    mergeFlow(nameList.asFlow(), cardList.asFlow(), passwordList.asFlow(), ::transformToEmployee)
        .collect {
            persons.add(it)
        }

    println(persons)

}

data class Employee(val name: String, var card: String, var password: String)

fun generateCardList(size: Int): MutableList<String> {
    val list: MutableList<String> = mutableListOf()
    repeat(size) {
        val cardNumber = StringBuilder("")
        repeat(16) {
            cardNumber.append((0..9).random())
        }
        list.add(cardNumber.toString())
    }
    return list
}

fun generatePasswordList(size: Int): MutableList<String> {
    val list: MutableList<String> = mutableListOf()
    repeat(size) {
        val cardNumber = StringBuilder("")
        repeat(4) {
            cardNumber.append((0..9).random())
        }
        list.add(cardNumber.toString())
    }
    return list
}

fun <T1, T2, T3, R> mergeFlow(
    first: Flow<T1>,
    second: Flow<T2>,
    third: Flow<T3>,
    transform: suspend (T1, T2, T3) -> R) : Flow<R> {

    return first.zip(second) {t1, t2 ->
        Pair(t1, t2)}
        .zip(third) {pair, t3 ->
            transform(pair.first, pair.second, t3)
        }
}

fun transformToEmployee(name: String, card: String, password: String) : Employee = Employee(name, card, password)