package flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow

val personList = listOf(
    Person("Алексей", "Администратор"),
    Person("Дмитрий", "Директор"),
    Person("Татьяна", "Кассир"),
    Person("Сергей", "Кладовщик")
)

suspend fun main() {

    val persons: MutableList<Person> = mutableListOf()
    val phones: MutableList<String> = mutableListOf()
    val size = personList.size

    withContext(newSingleThreadContext("avc")) {

        launch {
            getPhoneFlow(size).collect {
                phones.add(it)
                println(it)
            }
        }

        launch {
            getPersonsFlow().collect {
                persons.add(it)
                println(it)
            }
        }
    }

    val personInfo = persons.zip(phones) { person, phone -> "$person, $phone" }

    println(personInfo)

}

fun getPersonsFlow() = flow {
    for (person in personList) {
        emit(person)
    }
}

fun getPhoneFlow(length: Int) = flow {
    repeat(length) {
        var phoneNumber = "+7917"
        repeat(7) {
            phoneNumber += (0..9).random()
        }
        emit(phoneNumber)
    }
}