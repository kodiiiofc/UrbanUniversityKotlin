package overridefunc.task1

abstract class Bird {
    open var type: String = "нет данных"
    var maxWeight: Double = 0.0
    var length: Double = 0.0
    open var flyable: Boolean = false
    open var swimable: Boolean = false

    fun printInfo() = println("Птица $type ${if (flyable) "может летать" else "не может летать"} " +
            "и ${if (swimable) "может плавать" else "не может плавать"}. " +
            "Масса достигает $maxWeight. Длина тела составляет $length.")

    open fun fly() = println(if (flyable) "Птица летит" else "Птица летать не может")

    open fun swim() = println(if (swimable) "Птица плавает" else "Птица плавать не может")

}