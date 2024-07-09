package whiledowhile

fun main() {
    var N: Int = 1265
    while (N > 0) {
        println(N % 10)
        N /= 10
    }
}