package overridefunc.task1

fun main() {
    val pinguin = Pinguin()
    pinguin.length = 110.0
    pinguin.maxWeight = 46.0
    pinguin.printInfo()
    pinguin.fly()
    pinguin.swim()


    println("--------------------------------")

    val duck = Duck()
    duck.length = 62.0
    duck.maxWeight = 1.6
    duck.printInfo()
    duck.fly()
    duck.swim()

}