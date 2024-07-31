package typesoffunctions

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    doFunForEachEvenElement(array, ::plusOne)
    println(array.contentToString())
}

fun doFunForEachEvenElement(array: Array<Int>, operation: (Int) -> Int) {

    for (i in array.indices step 2) {
        array[i] = operation(array[i])
    }
}

fun plusOne(n: Int) : Int = n + 1
