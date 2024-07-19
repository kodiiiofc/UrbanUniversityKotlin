package classconstructors.task5

fun main() {
    val car1 = Car(1400)
    car1.start()
    car1.start(60)
    car1.stop()

    println()

    val car2 = Car(2300,40)
    car2.start()
    car2.stop()
}