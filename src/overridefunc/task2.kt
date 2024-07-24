package overridefunc

fun main() {
    val array = arrayOf("Это", "массив", "строк", "один", "два", "три")

    println(maxLengthString(array))


}

fun maxLengthString(array: Array<String>) : String {
    var result = ""
    for (string in array) {
        if (string.length > result.length) result = string
    }


    return result
}