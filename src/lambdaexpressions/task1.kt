package lambdaexpressions

fun main() {

    val print = { println("Привет, Мир!") }

    repeatFunc(print, 10)

}

fun repeatFunc(op: () -> Unit, count: Int) {
    repeat(count) {
        op()
    }
}