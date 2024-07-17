package classes.classmembers.task1

class Helicopter {
    var name: String = ""
    var weight: Int = 0
    var speed: Int = 0
    var height: Int = 0

    fun status() {
        println("Спроектировали вертолет с названием $name скоростью полета $speed км/ч весом $weight кг высотой полета $height м.")
    }
}