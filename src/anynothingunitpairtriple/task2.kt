package anynothingunitpairtriple

fun main() {

    val array = intArrayOf(1, 2, 3)
    var arrays : Array<IntArray> = arrayOf()

    for (i in array.indices) {
        for (j in array.indices) {
            if (j == i) continue

            for (k in array.indices) {
                if (k == i || k == j) continue

                arrays += intArrayOf(array[i], array[j], array[k])
            }
        }
    }

    arrays.forEach { println(it.contentToString()) }

}