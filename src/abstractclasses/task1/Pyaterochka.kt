package abstractclasses.task1

class Pyaterochka(startWorkingTime: String, endWorkingTime: String): Shop("Пятерочка", startWorkingTime, endWorkingTime) {

    override fun open() {
        isWorking = true
        println("$name открыта")
    }

    override fun close() {
        isWorking = false
        println("$name закрыта")
    }
}