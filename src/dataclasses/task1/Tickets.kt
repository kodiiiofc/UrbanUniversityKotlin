package dataclasses.task1

import java.util.*

class Tickets() {
    private var tickets: Array<Ticket> = arrayOf() // массив билетов

    fun buyTicket(movie: String, row: Int, seat: Int,time: String) {        // метод покупки билетов, с контролем их повторяемости
        val currentTicket = Ticket(movie, row, seat, time)
        if (currentTicket in tickets) {
            println("Данное место на данный сеанс уже занято")
        }
        else {
            tickets += currentTicket
        }
    }

    fun showAllTickets() {                          // метод вывода билетов
        println(tickets.contentToString())
    }

    fun showAllTickets(movie: String) {             // метод фильтра билетов по наименованию фильма
        val stream = Arrays.stream(tickets).filter{ ticket: Ticket -> ticket.movie == movie}
        println(stream.toArray().contentToString())
    }

    private data class Ticket(val movie: String, val row: Int, val seat: Int,val time: String) // Класс приватным, чтобы кто угодно не мог выпустить новые билеты

}

