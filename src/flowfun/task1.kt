package flowfun

import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val length = getLength()
    val prefix = getPrefix()
    val idToPasswordMap: MutableMap<String, String> = mutableMapOf()
    val time = measureTimeMillis {
        getIdFlow(length).zip(getPasswordFlow(prefix, length)) { id, password ->
            Pair(id, password)
        }.toList().associateTo(idToPasswordMap) { it }
    }
    println("На создание ассоциативного списка (словаря) паролей ушло $time мс")
    println("Полученный словарь приведен ниже:")
    println(idToPasswordMap)
}

private fun getPrefix(): Char {
    println("Введите символ с которого будет начинаться пароль (только цифры или латинские буквы)")
    var prefix = readln()
    while (!prefix.matches("\\w+".toRegex())) {
        println("Пожалуйста, введите число или латинскую букву")
        prefix = readln()
    }
    return prefix.first()
}

private fun getLength(): Int {
    println("Введите количество пользователей, для которых необходимо сгенерировать пароли")
    var lengthString = readln()
    while (!lengthString.matches("\\d+".toRegex())) {
        println("Пожалуйста, введите число")
        lengthString = readln()
    }
    val length = lengthString.toInt()
    return length
}

fun createPassword(): String {
    val chars = ('0'..'9').toList() + ('a'..'z').toList() + ('A'..'Z').toList()
    val password = StringBuilder("")
    for (i in 0..5) {
        var char = chars.random()
        if (i % 2 == 1) char = char.uppercaseChar()
        password.append(char)
    }
    return password.toString()
}

fun getListOfPassword(input: Char, length: Int): List<String> {
    val passwordList: MutableList<String> = mutableListOf()
    repeat(length) {
        var password = createPassword()
        while (password.first() != input) {
            password = createPassword()
        }
        passwordList.add(password)
    }
    return passwordList
}

fun getListId(length: Int): List<String> {
    val list: MutableList<String> = mutableListOf()
    for (i in 1..length) {
        list.add((1000000 + i).toString().removePrefix("1"))
    }
    return list
}

fun getIdFlow(length: Int) = getListId(length).asFlow()

fun getPasswordFlow(input: Char, length: Int) = getListOfPassword(input, length).asFlow()
