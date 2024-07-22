package abstractclasses.task2

fun main() {
    val student = Student("Иван", "Иванов", 20)
    val employee = Employee("Михаил", "Михайлов", 35)

    student.toEat()
    student.toStudy()
    student.toWork()
    student.toSleep()
    student.toMove()
    student.toCelibrateBirthDay()

    println()

    employee.toEat()
    employee.toWork()
    employee.toCelibrateBirthDay()
    employee.toMove()
    employee.toEat()
    employee.toSleep()


}