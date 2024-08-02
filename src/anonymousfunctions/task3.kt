package anonymousfunctions

fun main() {
    val concat = fun(stringOne: String, stringTwo: String) = stringOne + stringTwo

    println(concat("Привет", " мир"))
}