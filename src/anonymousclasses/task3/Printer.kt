package anonymousclasses.task3

abstract class Printer(val name: String, val ip: String, var format: String, var coloredPrint: Boolean) {

    abstract fun print(document: String, copies: Int)

    abstract fun info()

    fun colorPrint() {
        coloredPrint = true
    }

    fun blackAndWhitePrint() {
        coloredPrint = false
    }
}