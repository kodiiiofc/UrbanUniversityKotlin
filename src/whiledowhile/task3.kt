package whiledowhile

fun main() {
    var counter: Int = 0
    val A: Int = 36
    val B: Int = 50
    var n: Int = A
    while (n in A..B) {
        println(n)
        n++
        counter++
    }
    println("Всего чисел $counter")
}