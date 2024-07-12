package arrays

fun main() {
    val array = arrayOf<Float>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f)
    var mp = 1.0f;
    for (i in array) {
        mp *= i
    }
    println(mp)
}