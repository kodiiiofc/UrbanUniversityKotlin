package innerclassesandinterfaces

fun main() {
    var array = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    while (true) {
        val result = find(readln(), array)
        println(result.contentToString())
    }

}

fun find(string: String, array: Array<String>): Array<String> {
    var result: Array<String> = arrayOf()

    var dropIndexes: Array<Int> = arrayOf()

    for (j in array.indices) {
        var currentLine = array[j]
        for (i in 0 until  string.length) {
            var flag = !currentLine[i].equals(string[i],true)

            if (flag) {
                dropIndexes += j
                break
            }

        }


    }

    for (i in array.indices) {
        if (i !in dropIndexes) result += array[i]
    }

    return result
}