package abstractclasses.task2

class Employee(firstName: String, secondName: String, age: Int) : Person(firstName, secondName, age) {
    override fun toWork() {
        println("$firstName $secondName делает вид, что работает")
    }

    override fun toEat() {
        println("$firstName $secondName кушает")
    }

    override fun toSleep() {
        println("$firstName $secondName спит")
    }

    override fun toMove() {
        println("$firstName $secondName передвигается исключительно на автомобиле")
    }
}