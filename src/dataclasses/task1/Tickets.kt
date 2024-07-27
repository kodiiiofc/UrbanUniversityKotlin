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

    fun askForBuy() {
        while (true) {

            // Выбираем фильм

            println("Выберите фильм:")

            for (i in MOVIES.indices) {
                println("$i - ${MOVIES[i]}")
            }

            var movieIndex = -1;
            while (movieIndex !in MOVIES.indices) {
                println("Пожалуйста, введите число от 0 до ${MOVIES.size - 1}")
                movieIndex = readln().toInt();
            }
            val movie = MOVIES[movieIndex]
            println("Вы выбрали фильм $movie")

            // Выбираем время

            val arrayTimes: Array<String> = MOVIES_TIMES[movie]!!

            println("Выберите время сеанса:")
            for (i in arrayTimes.indices) {
                println("$i - ${arrayTimes[i]}")
            }

            var timeIndex = -1

            while (timeIndex !in arrayTimes.indices) {
                println("Пожалуйста, введите число от 0 до ${arrayTimes.size - 1}")
                timeIndex = readln().toInt();
            }

            val time = arrayTimes[timeIndex]

            println("Вы выбрали фильм $movie в $time")

            // Выбираем ряд

            println("Выберите ряд 0 до 10:")

            var row = -1

            while (row !in 0..10) {
                println("Пожалуйста, введите число от 0 до 10")
                row = readln().toInt();
            }

            // Выбираем место

            println("Выберите место 0 до 14:")

            var seat = -1

            while (seat !in 0..14) {
                println("Пожалуйста, введите число от 0 до 14")
                seat = readln().toInt();
            }

            println("Вы выбрали место $seat ряд $row")

            buyTicket(movie, row,seat, time)

            println("Ввидите \"да\", если хотите приобрести еще билет: ")

            if (readln().lowercase() != "да") break
        }
    }

    private data class Ticket(val movie: String, val row: Int, val seat: Int,val time: String) // Класс приватным, чтобы кто угодно не мог выпустить новые билеты

}

