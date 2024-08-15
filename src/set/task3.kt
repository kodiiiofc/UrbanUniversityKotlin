package set

fun main() {

    val list = listOf(13, 33, 57, 21, 321, 72, 1, 72, 7, 4, 2317, 99, 21, 33, 99)

    val listTwo: List<Int>? = null

    println(removeDuplicates(list))

    println(removeDuplicates(listTwo))

}

fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {

    return collection?.toSet()
}