package operatorfor

const val PI = 3.14

fun main() {
    val circleS = 3144.0
    var circleD = 0.0

    for (i in 0 .. (circleS.toInt() * 100)) {
        if (i * i * PI / 4 >= circleS * 100) {
            circleD = i / 10.0
            break
        }
    }


    val circleL = PI * circleD
    println("Диаметр окружности диаметром $circleS равен $circleD. Длина такой окружности $circleL")
}