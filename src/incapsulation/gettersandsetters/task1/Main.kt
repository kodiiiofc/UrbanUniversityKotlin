package incapsulation.gettersandsetters.task1

fun main() {
    val creditCard = CreditCard(2200_3344_7600_1234L)
    val temp = creditCard.cardNumber

    creditCard.cardInfo()

    creditCard.setPin("5123")

    creditCard.getAccess("12345678")
    creditCard.cardInfo()

    creditCard.getAccess("12345678")
    creditCard.setPin("5123")

    creditCard.setPassword("1234")

    creditCard.getAccess("12345678")
    creditCard.setPassword("1234")

    creditCard.cardInfo()

    creditCard.cardInfo("1234")




}