package arrays

fun main() {
    val N = 8
    var array = Array(N) {2}
    for (i in 1..N) {
        var currentNumber = 1
        for (j in 1..i){
            currentNumber *= 2
        }
        array[i - 1] = currentNumber
    }
    println(array.contentToString())
}