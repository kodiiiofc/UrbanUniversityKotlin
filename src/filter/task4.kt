package filter

fun main() {

    val map = mapOf(
        "103" to 50,
        "205" to 30,
        "206" to 10,
        "131" to 23,
        "555" to 13,
        "63" to 33,
    )

    val filteredMap = map.filter { (key, value) -> key.endsWith('5') && value > 20 }

    println(filteredMap)
}