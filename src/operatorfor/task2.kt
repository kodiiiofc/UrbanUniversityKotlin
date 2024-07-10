package operatorfor


fun main() {
    val circleS : Double = 3144.0
    val circleD = Math.sqrt((4 * circleS / Math.PI))
    val circleL = Math.PI * circleD
    println("Диаметр окружности диаметром $circleS равен $circleD. Длина такой окружности $circleL")
}