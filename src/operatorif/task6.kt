package operatorif

fun main() {
    println(operation(5.0,2.0,1))
    println(operation(5.0,2.0,2))
    println(operation(5.0,2.0,3))
    println(operation(5.0,2.0,4))
}

fun operation(x : Double, y : Double, numberOfOperation : Int) : Double {
    return if (numberOfOperation == 1) {
        x + y
    } else if (numberOfOperation == 2) {
        x - y
    } else if (numberOfOperation == 3) {
        x * y
    } else if (numberOfOperation == 4) {
        x / y
    } else {
        println("Номеру $numberOfOperation действий не назначено")
        0.0
    }
}