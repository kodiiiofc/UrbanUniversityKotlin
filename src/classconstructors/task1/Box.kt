package classconstructors.task1

class Box constructor(val width: Int, val height: Int, val depth: Int) {
    private val volume = width * height * depth

    fun getVolume() = volume
}