package aggregateoperations

fun main() {

    val list = listOf(
        Player("Иван Иванов", 131, 12000),
        Player("Денис Денисов", 421, 9000),
        Player("Василий Васильев", 331, 15300),
        Player("Алексей Алексеев", 111, 6600)
    )

    println("Перечень игроков: $list")

    println("Общее количество заработанных очков: ${list.sumOf { it.points }}")
    println("Общее количество выигранных денег: ${list.sumOf { it.gotMoney }}")

}

data class Player(val name: String, var points: Int, var gotMoney: Long)