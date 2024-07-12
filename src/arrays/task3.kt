package arrays

fun main() {
    val size : Int = 5
    var K : Int = 0

    var array = Array(size) {0}

    array[0] = 3
    array[1] = 4
    array[2] = 7
    array[3] = 4
    array[4] = 68

    for (i in array) {
        if (i % 2 == 0) {
            println(i)
            K++
        }
    }
    println("Количество четных элементов: $K")
}