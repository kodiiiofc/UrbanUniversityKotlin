package Innerclassesandinterfaces.task1

fun main() {
    val romanM = Human("Роман Мохнаткин")
    romanM.Head().think()
    romanM.Hands().use("клавиатура")


    romanM.Legs().sit() // создаем экземпляр ног и у него вызываем метод сидеть

    romanM.Legs().walk() // создаем еще 1 экземпляр ног и у него вызываем метод ходить

    romanM.Legs().run() // создаем еще 3-й экземпляр ног и у него вызываем метод бегать

    val romanMLegs = romanM.Legs() // создаем 4-й экземпляр ног

    romanMLegs.sit() // у 4-го экземпляра ног вызываем метод сидеть
    romanMLegs.walk() // у 4-го экземпляра ног вызываем метод ходить
    romanMLegs.run() // у 4-го экземпляра ног вызываем метод бегать


}