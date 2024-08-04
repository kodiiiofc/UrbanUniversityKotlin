package lambdaexpressions

fun main() {

    val onlyPositive: (Array<Int>) -> Array<Int> = {array ->
        var result: Array<Int> = arrayOf()

        for (number in array) {
            if (number > 0) result += number
        }

        result
    }

    val array = arrayOf(1, 2, 3, 5, -6, 8, 72, -3)

    val onlyPositiveSecondVariant: (Array<Int>) -> Array<Int> = {it.filter { n -> n > 0 }.toTypedArray()}

    println(onlyPositive(array).contentToString())

    println(onlyPositiveSecondVariant(array).contentToString())

}