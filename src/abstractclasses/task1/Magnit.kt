package abstractclasses.task1

class Magnit(startWorkingTime: String, endWorkingTime: String): Shop("Магнит", startWorkingTime, endWorkingTime) {

    override fun open() {
        isWorking = true
        println("Магазин $name открыт")
    }

    override fun close() {
        isWorking = false
        println("Магазин $name закрыт")
    }

    override fun takeInventory() {
        println("Магазин $name проводит инвентаризацию")
    }
}