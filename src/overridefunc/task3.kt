package overridefunc

fun main() {
    val string = "ПриВет, кАк деЛа"
    countUppercaseLetters(string)
}

fun countUppercaseLetters(string: String) {
    var counter = 0
    var resultString = ""
    for (char in string.toCharArray()) {
        if (char.isUpperCase()) {
            counter++
            resultString += char
        }
    }
    println("Количество символов в верхнем регистре: $counter")
    println(resultString)
}