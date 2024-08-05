package classstring

fun main() {
    val firstPhoneNumber = "+79998888855"
    val secondPhoneNumber = "  +79998889966 "
    val thirdPhoneNumber = "89998889966"
    val fourthPhoneNumber = "+7996"
    val fifthPhoneNumber = "  +79998dd9966 "

    println("Phone number $firstPhoneNumber is valid: ${isValidPhoneNumberRegex(firstPhoneNumber)}")
    println("Phone number $secondPhoneNumber is valid: ${isValidPhoneNumberRegex(secondPhoneNumber)}")
    println("Phone number $thirdPhoneNumber is valid: ${isValidPhoneNumberRegex(thirdPhoneNumber)}")
    println("Phone number $fourthPhoneNumber is valid: ${isValidPhoneNumberRegex(fourthPhoneNumber)}")
    println("Phone number $fifthPhoneNumber is valid: ${isValidPhoneNumberRegex(fifthPhoneNumber)}")

    println("------------------------------")

    println("Phone number $firstPhoneNumber is valid: ${isValidPhoneNumber(firstPhoneNumber)}")
    println("Phone number $secondPhoneNumber is valid: ${isValidPhoneNumber(secondPhoneNumber)}")
    println("Phone number $thirdPhoneNumber is valid: ${isValidPhoneNumber(thirdPhoneNumber)}")
    println("Phone number $fourthPhoneNumber is valid: ${isValidPhoneNumber(fourthPhoneNumber)}")
    println("Phone number $fifthPhoneNumber is valid: ${isValidPhoneNumber(fifthPhoneNumber)}")

}

fun isValidPhoneNumberRegex(phoneNumber: String) : Boolean {
    val regex = """\+7\d{10}""".toRegex() // строим ругулярное выражение +7[ч][ч][ч][ч][ч][ч][ч][ч][ч][ч], где [ч] - число от нуля до девяти
    return phoneNumber.trim().matches(regex) // сравниваем переданную строку без пробелов с регулярным выражением
}

fun isValidPhoneNumber(phoneNumber: String) : Boolean {
    val trimmed = phoneNumber.trim()
    val countryCode = trimmed.substring(0..1) // выделяем код страны

    if (countryCode != "+7") return false // проверяем код страны "+7"

    val number = trimmed.substring(2) // выделяем строку без кода страны

    if (number.length != 10) return false // проверяем количество цифр в Phone numberе (кроме +7)

    return number.all { it.isDigit() } // проверяем все символы, чтобы были цифрами

}