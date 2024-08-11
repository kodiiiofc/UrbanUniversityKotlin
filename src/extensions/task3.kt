package extensions

fun main() {

    val string = "Привет, Мир!"

    println(
        "Last index of \"$string\" is ${string.lastIndex}. " +
                "There is symbol \'${string[string.lastIndex]}\'"
    )

}

val String.lastIndex: Int
    get() = length - 1