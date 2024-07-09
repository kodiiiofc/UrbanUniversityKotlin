package whiledowhile

fun main() {
    val months: Int = 9
    var deposit: Int = 350
    val percentPerMonth: Int = 7
    var currentMonth: Int = 0
    while (currentMonth++ < months) {
        deposit += deposit * percentPerMonth / 100
    }
    println(deposit)
}