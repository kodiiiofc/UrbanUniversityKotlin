package operatorfor

fun main() {
    val x1 = 5
    val y1 = 6
    val x2 = 52
    val y2 = 66

    val a = x2 - x1
    val b = y2 - y1

    val perimeter = (a + b) * 2
    val square = a * b

    println("Прямоугольник с вершинами диагонали в точках ($x1, $y1) и ($x2, $y2) имеет периметр равный $perimeter и площадь равную $square")

}