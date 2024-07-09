package whiledowhile

fun main() {
    val priceForKG: Int = 75
    var kg: Int = 10
    do println(priceForKG * kg) while (--kg > 0)
}