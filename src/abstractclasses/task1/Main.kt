package abstractclasses.task1

fun main() {
    val pyaterochka = Pyaterochka("9:00","20:00")
    pyaterochka.open()
    pyaterochka.takeInventory()
    pyaterochka.open()
    pyaterochka.close()

    val magnit = Magnit("8:00", "23:00")
    magnit.open()
    magnit.takeInventory()
    magnit.open()
    magnit.close()
}