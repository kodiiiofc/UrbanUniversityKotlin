package operatorwhen

fun main() {
    var a = 8
    var b = 5
    println("a = $a, b = $b")
    a = a + b
    b = a - b
    a = a - b
    println("a = $a, b = $b")
}
