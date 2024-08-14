package list

fun main() {
    val list = listOf(13,33,57,21,321,72,1,72,7,4,2317,99)

    var sum = 0
    list.forEach{ sum += it }
    println(sum)

    println(list.sum())

}