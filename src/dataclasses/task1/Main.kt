package dataclasses.task1

val MOVIES = arrayOf("Головоломка", "Человек из стали", "Зеленая книга", "Дэдпул", "Поехавшая")
val MOVIES_TIMES = mapOf(
    MOVIES[0] to arrayOf("10:00", "14:00", "20:00"),
    MOVIES[1] to arrayOf("16:00", "20:00"),
    MOVIES[2] to arrayOf("18:00", "20:00", "22:00"),
    MOVIES[3] to arrayOf("20:00", "23:00"),
    MOVIES[4] to arrayOf("10:00", "14:00", "18:00", "20:00", "22:30")
)

fun main() {

    val tickets = Tickets()
    tickets.askForBuy()

    tickets.showAllTickets(MOVIES[0])

    tickets.showAllTickets()



}



