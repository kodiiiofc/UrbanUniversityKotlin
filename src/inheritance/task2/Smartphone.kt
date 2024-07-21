package inheritance.task2

open class Smartphone {
    val type = "Смартфон"
    open var name = "unnamed"
    var model = ""
    var weight = 150
    var height = 200.0
    var width = 100.0
    var thickness = 10.0

    fun toCall() {
        println("$type $name $model звонит...")
    }

    fun aboutPhone() {
        println("$type $name $model. Вес $weight г. Габаритные размеры $height x $weight x $thickness (мм).")
    }


}