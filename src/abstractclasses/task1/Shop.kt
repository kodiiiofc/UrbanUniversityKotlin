package abstractclasses.task1

abstract class Shop(val name: String, val startWorkingTime: String, val endWorkingTime: String) {

    protected var isWorking = false

    abstract fun open()

    abstract fun close()

    open fun takeInventory() {
        close()
        println("Магазин проводит инвентаризацию")
    }



}