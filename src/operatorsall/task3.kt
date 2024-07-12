package operatorsall

fun main() {
    val A: Int = 3
    val B: Int = 5
    for (i in A..B) {
        for (j in 0..(i-A)) print("$i ")
    }
}