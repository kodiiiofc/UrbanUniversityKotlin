package infixfunctions

fun main() {

    val pointOne = Point(14, 33)
    val pointTwo = Point( 3, 50)

    println("Точка один выше точки два? ${pointOne isAbove pointTwo}")
    println("Точка один правее точки два? ${pointOne isRightOf pointTwo}")

}

data class Point(var x: Int, var y: Int) {
    infix fun isAbove(point: Point) = this.y - point.y > 0

    infix fun isRightOf(point: Point) = this.x - point.x > 0
}