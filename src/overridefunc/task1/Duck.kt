package overridefunc.task1

class Duck : Bird() {
    override var type: String = "Утка"
    override var flyable: Boolean = true
    override var swimable: Boolean = true

    override fun fly() = println(if (flyable) "Утка летит" else "Утка летать не может")

    override fun swim() = println(if (swimable) "Утка плавает" else "Утка плавать не может")
}