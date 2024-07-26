package Innerclassesandinterfaces

fun main() {
    val array = arrayOf(0,1,2,3,5,6,8,0,72,0,3)
    println(countNumbersBetweenTwoZeros(array))


}

fun countNumbersBetweenTwoZeros(array: Array<Int>) : Int{
    // Ищем первый ноль за которым не идет ноль
    var firstIndex = 0
    for (i in 0 .. array.size - 2) {
        if (array[i] == 0 && array[i + 1] != 0) {
            firstIndex = i
            break
        }
    }
    // Ищем следующий ноль за первым
    var secondIndex = 0
    for (i in firstIndex + 1 until array.size) {
        if (array[i] == 0) {
            secondIndex = i
            break
        }
    }
    return secondIndex - firstIndex - 1
}