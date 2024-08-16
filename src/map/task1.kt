package map

fun main() {
    val array = arrayOf(2, 4, 7, 1, 2, 4)

    println(countEachElementInArray(array))

    val arrayString = arrayOf("hello", "world", "hi", "world", "Bill Gates", "Kotlin")

    println(countEachElementInArray(arrayString))
}

fun <K> countEachElementInArray(array: Array<K>) : Map<K, Int> {

    val map: MutableMap<K, Int> = mutableMapOf()

    array.forEach { currentElement: K ->
        if (map[currentElement] == null) map[currentElement] = array.count {(currentElement == it)} }

    // если в словаре отсутствует такой ключ, то записываем в этот ключ количество повторений этого значения
    // проверка на null нужна для сокращения времени работы, для массивов с много кратным повторением
    // одинакового значения (не имеет смысла его каждый раз пересчитывать)

    return map
}