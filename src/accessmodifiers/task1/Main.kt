package accessmodifiers.task1

fun main() {
    val user1 = Registration("user@mail.ru")
    println(user1.getEmail())
    user1.setPassword("1234")
    user1.setPassword("1234314")

}