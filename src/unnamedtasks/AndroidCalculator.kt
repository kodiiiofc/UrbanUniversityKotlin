package unnamedtasks

fun main() {

    val mpSymbol = "*"
    val divSymbol = "/"

    var string = "*5*6-"

//    if (string.matches("""^d+.+d$""".toRegex())) {
//        println("Строка подходит")
//    }

    if (string.first() == '-') {
        string = "0" + string
    } else if (string.first() == mpSymbol[0] || string.first() == divSymbol[0] || string.first() == '+') {
        string = string.substring(1)
    }

    println(string)

    if (string.last().toString().matches("""[+$mpSymbol$divSymbol\-]""".toRegex())) {
        string = string.substring(0..string.length - 2)}

    println(string)

    val numbers = string.split("\\D".toRegex()).map { it.toInt() }.toMutableList()
    val operations = string.split("\\d".toRegex()).filter { it.isNotBlank() }.toMutableList()

    println(numbers)
    println(operations)

    while (operations.contains(mpSymbol) || operations.contains(divSymbol)) {

        val multiplyIndex = operations.indexOf(mpSymbol)
        val divideIndex = operations.indexOf(divSymbol)

        if (multiplyIndex in 1..<divideIndex || divideIndex < 0) {
            val temp = numbers[multiplyIndex] * numbers[multiplyIndex + 1]
            numbers.removeAt(multiplyIndex + 1)
            numbers[multiplyIndex] = temp
            operations.removeAt(multiplyIndex)
        } else {
            val temp = numbers[divideIndex] / numbers[divideIndex + 1]
            numbers.removeAt(divideIndex + 1)
            numbers[divideIndex] = temp
            operations.removeAt(divideIndex)
        }

    }

    var result = numbers[0]

    for (operation in operations.withIndex()) {
        if (operation.value == "+") {
            result += numbers[operation.index+1]
        } else result -= numbers[operation.index+1]
    }

    println(result)


}
