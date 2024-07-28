package enumclass

fun main() {
    val s = "Шумоизоляция"
    val result = countRepeatedChars(s)
    println(result.contentToString())
}

fun countRepeatedChars(string: String) : Array<String> {
    var charArray: Array<String> = arrayOf()

    for (char in string.toCharArray()) {        // проверяем для каждой буквы в слове
        var counter = 0
        for (currentChar in string.toCharArray()) { // считаем количество данной буквы к слове
            if (char == currentChar) {
                counter++
            }
        }
        if (counter > 1) {      // добавляем в массив букву и количество ее повторений (> 1) с проверкой на повторение значения в массиве
            val string = "$char = $counter"
            if (string !in charArray) charArray += string
        }
    }

    return charArray
}