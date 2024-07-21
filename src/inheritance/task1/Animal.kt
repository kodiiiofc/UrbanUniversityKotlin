package inheritance.task1

open class Animal {
    var name: String = "без имени"
    var weight: Double = 0.0

    fun eat() {
        println("$name кушает")
    }
}