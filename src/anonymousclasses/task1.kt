package anonymousclasses

fun main() {
    val array = arrayOf("Это", "массив", "строк", "один", "два", "три")

    val longestString = maxLengthString(array)

    println("Самое длинное слово в массиве: $longestString, количество букв в нем: ${longestString.length}")


}

fun maxLengthString(array: Array<String>) : String {
    var result = ""
    for (string in array) {
        if (string.length > result.length) result = string
    }


    return result
}