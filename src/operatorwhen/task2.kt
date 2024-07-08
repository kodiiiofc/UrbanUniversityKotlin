package operatorwhen

fun main() {
    var variable : Double = 3215.31
    var numberAfterPoint : Double = variable % 1
    var result : Double

    when {
        numberAfterPoint < 0.5 -> result = variable - numberAfterPoint
        else -> result = variable + (1 - numberAfterPoint)
   }
    println(result)
}