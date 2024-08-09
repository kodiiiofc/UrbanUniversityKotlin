package nullandnullabletypes

fun main() {
    val array = arrayOf("Привет","как", null, "дела")

    val result: Array<String> = excludeNullsInArray(array)

    println(result.contentToString())
}

fun excludeNullsInArray(array: Array<String?>) : Array<String> {
    var result: Array<String> = arrayOf()
    array.forEach { if (it != null) result += it }
    return result
}