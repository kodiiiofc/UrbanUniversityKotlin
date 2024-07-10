package operatorfor

fun main() {
    for (i in 0..9) {
        var n = 1;
        repeat(i) {
            n *= 2
        }
        println(n) }
}