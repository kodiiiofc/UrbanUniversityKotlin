package overridefunc.task1

class Pinguin : Bird() {
    override var type: String = "Пингвин"
    override var flyable: Boolean = false
    override var swimable: Boolean = true

    override fun fly() = println(if (flyable) "Пингвин летит" else "Пингвин летать не может")

    override fun swim() = println(if (swimable) "Пингвин плавает" else "Пингвин плавать не может")
}