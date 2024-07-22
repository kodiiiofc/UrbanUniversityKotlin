package abstractclasses.task2

abstract class Person(val firstName: String, val secondName: String, var age: Int) {
    abstract fun toWork()
    abstract fun toEat()
    abstract fun toSleep()

    open fun toMove() {
        println("$firstName $secondName передвигается пешком")
    }

    open fun toCelibrateBirthDay() {
        println("$firstName $secondName празднует День Рождения!")
        age += 1
    }

}