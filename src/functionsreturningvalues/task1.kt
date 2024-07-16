package functionsreturningvalues

fun main() {
    val array: Array<Int> = arrayOf(6,3,1,6,2,7,41,5,67,11,2,31)
    val count = findCountOfLocalMinimals(array)
    println(count)


}

fun findCountOfLocalMinimals(array: Array<Int>) : Int {
    var prevElement: Int
    var currentElement: Int
    var nextElement: Int


    var countOfLocalMinimals = 0

    for (i in 1 until array.size - 1) {
        prevElement = array[i - 1]
        currentElement = array[i]
        nextElement = array[i + 1]
        if (currentElement < prevElement && currentElement < nextElement) {
            countOfLocalMinimals += 1
        }

    }

    return countOfLocalMinimals
}