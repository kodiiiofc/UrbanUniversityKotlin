package filter

fun main() {

    val map = mapOf(
        1 to "Роман",
        2 to "Дарья",
        3 to "Вячеслав",
        5 to "Илья",
        6 to "Дмитрий",
        10 to "Ангелина",
        113 to "Георгий",
        83 to "Григорий"
    )

    val filteredMap = map.filter{(_, value) -> value.startsWith('Г')}

    println(filteredMap)

}