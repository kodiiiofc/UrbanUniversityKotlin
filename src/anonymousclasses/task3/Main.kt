package anonymousclasses.task3

fun main() {
    val printerOne = object : Printer("Canon TM-200", "192.168.0.205", "A1", true){
        override fun print(document: String, copies: Int) {
            println("Документ $document отправлен на печать на принтер $name на формате $format в количестве экземпляров: $copies")
        }
        override fun info() {
            println("Принтер $name (ip: $ip) готов к печати. Формат печати: $format. Цветная печать: $coloredPrint")
        }
    }

    val printerTwo = object : Printer("Hp DesignJet 730", "192.168.0.203", "A3", true){
        override fun print(document: String, copies: Int) {
            println("$name печатает $document. Количество экземпляров: $copies")
        }
        override fun info() {
            println("$name на связи. Формат печати: $format. Цветная печать: $coloredPrint")
        }
    }

    printerOne.info()

    printerOne.print("Ташкентская 15А.dwg", 3)

    printerTwo.info()

    printerTwo.print("Давыдковская 10А.pdf", 1)

}