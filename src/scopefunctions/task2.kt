package scopefunctions

class City(val name: String, var population: Int)

fun main() {
    val orenburg =  City("Оренбург", 0)
    orenburg.apply { this.population = 578_014 }
        .let { println("${it.name} : ${it.population} чел.") }
}