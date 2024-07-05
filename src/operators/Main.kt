package operators

const val pi = 3.14

fun main() {
    val a = 3
    val b = 5
    val squareP = 4 * a             // периметр квадрата со сторой a
    val squareS = a * a             // площадь квадрата со сторой a
    val rectangleP = 2 * (a + b)     // периметр прямоугольника со сторонами a и b
    val rectangleS = a * b          // площадь прямоугольника со сторонами a и b

    println("Периметр квадрата со сторой " + a + " равен " + squareP + ". Площадь такого квадрата " + squareS + ".")
    println("Периметр прямоуголника со сторонами " + a + " и " + b + " равен " + rectangleP + ". Площадь такого квадрата " + rectangleS + ".")


    val d = 75
    val circleL = pi * d            // длина окружности

    println("Длина окружности диаметром " + d + " составляет " + circleL)

    val L = 421                     // длина в сантиметрах
    val Lm = L / 100                // длина в метрах

    println("Длина " + L + " сантиметров равна " + Lm + " полным метрам." )

    val A = 885
    val B = 45
    val n = 885 / 45

    println("В удаве длиной " + A + " см вмещается "  + n + " попугаев длиной " + B + " см.")

}