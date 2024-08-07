package genericconstraints

fun main() {
    val array = arrayOf<Number>(10, 2.0, 3.0, 4.0, 5.0, 6, 7, 8.0f, 900L)
    val state = States<Int>()

    println(state.getAverage(array))

}

class States<T>() where T: Number {

    fun <T> getAverage(array: Array<T>) : Double where T: Number {
        var sum = 0.0
        array.forEach { sum += it.toDouble() }
        return sum / 2
    }


}