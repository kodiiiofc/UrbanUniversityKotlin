package inheritance.task1

fun main() {
    val cat = Cat()
    cat.name = "Локи"
    cat.weight = 4.6

    val dog = Dog()
    dog.name = "Сэм"
    dog.weight = 6.3

    val animal = Animal()
    animal.name = "Гера"
    animal.weight = 8.8


    cat.meow()
    cat.eat()

    dog.bark()
    dog.eat()

    animal.eat()
}