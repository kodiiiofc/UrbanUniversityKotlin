package classconstructors.task5

class Car constructor(val weight: Int, var speed: Int = 0) {

    fun start() {
        if (speed > 0) println("Автомобиль движется со скоростью $speed")
        else println("Задайте скорость движения автомобиля")
    }

    fun start(speed: Int) {
        this.speed = speed
        println("Автомобиль движется со скоростью $speed")
    }

    fun stop() {
        println("Автомобиль остановлен")
        speed = 0
    }
}