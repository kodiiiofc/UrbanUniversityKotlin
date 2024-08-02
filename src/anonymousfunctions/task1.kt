package anonymousfunctions

fun main() {
    val happyNewYear = fun (name: String, year: Int) : String = "$name! Поздравляем с наступающим Новым $year годом!"

    println(happyNewYear("Александр", 2025))
}