package genericsclassesandfunctions

fun main() {
    val personOne = Person("Роман", 7_999_888_12_34)
    val personTwo = Person("Дарья", "+7 999 888 99 66")

    println(personOne)

    println(personTwo)

}

class Person<T>(val name: String, val phoneNumber: T) {
    override fun toString(): String {
        return "Person: name = $name, phone = $phoneNumber"
    }
}