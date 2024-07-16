package functionsreturningvalues

fun main() {
    val array: Array<Int> = arrayOf(6,3,-3,6,2,-7,41,5,-67,11,2,31)
    println(array.contentToString())
    val newArray = strangeMethod(array)
    println(array.contentToString())
    println(newArray.contentToString())
}

fun strangeMethod(array: Array<Int>) : Array<Int> {
    for (i in array.indices) {
        if (array[i] < 1) array[i] += 1
    }
    return array
}