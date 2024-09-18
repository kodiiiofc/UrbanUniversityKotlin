package unnamedtasks

fun main() {
    println(getValue("10"))
    println(getValue("Строка"))
    println(getValue("1d"))
}

private fun getValue(string: String) : Int {
    var value = string
    var valueInt = 0

    if (!value.contains(""".*\D+.*""".toRegex())) {
        valueInt = value.toInt()
    }

    return valueInt
}