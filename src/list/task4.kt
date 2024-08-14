package list

fun main() {
    val list = listOf(13,33,57,21,321,72,1,72,7,4,2317,99)

    println(list.size)

    var count = 0
    list.forEach{count++}
    println(count)

    println(list.count())

}