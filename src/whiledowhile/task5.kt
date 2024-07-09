package whiledowhile

fun main() {
    var i = 1; while (i++ < 20) if (i == 19) break else if (i % 2 == 0) if (i % 4 == 0) println(2 * i) else println(i)
}