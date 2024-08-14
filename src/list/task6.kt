package list

fun main() {
    val list = listOf(13,33,57,21,321,72,1,72,7,4,2317,99)

    var sumOfIndices = 0
    for (i in list.indices) sumOfIndices += i
    println(sumOfIndices)

    println(list.indices.sum())
}