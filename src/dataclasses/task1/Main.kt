package dataclasses.task1

fun main() {

    val tickets = Tickets()
    tickets.buyTicket("Головоломка", 5, 3, "16:00")
    tickets.buyTicket("Головоломка", 6, 3, "16:00")
    tickets.buyTicket("Головоломка", 3, 3, "16:00")

    tickets.showAllTickets()

    tickets.buyTicket("Головоломка", 3, 3, "16:00")
    tickets.buyTicket("Головоломка", 3, 8, "16:00")

    tickets.buyTicket("Человек из стали", 6, 15, "20:00")

    tickets.showAllTickets()
    tickets.showAllTickets("Человек из стали")
}