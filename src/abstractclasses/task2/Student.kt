package abstractclasses.task2

class Student(firstName: String, secondName: String, age: Int) : Person(firstName, secondName, age) {


    fun toStudy() {
        println("$firstName $secondName играет в доту, вместо учебы")
    }

    override fun toWork() {
        println("$firstName $secondName делает курсовые работы сокурсникам за деньги")
    }

    override fun toEat() {
        println("$firstName $secondName съел сникерс и запил энергетиком")
    }

    override fun toSleep() {
        println("$firstName $secondName думает, что спит")
    }

    override fun toMove() {
        println("$firstName $secondName передвигается пешком или на автобусе")
    }
}