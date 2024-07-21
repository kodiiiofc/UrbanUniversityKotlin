package incapsulation.gettersandsetters.task1

class CreditCard private constructor() {        // Делаем данный конструктор приватным

    constructor(numberOfCreditCard: Long) : this() {           //  Добавляем конструктор с инициализацией переменной cardNumber через сеттер
        cardNumber = numberOfCreditCard
    }

    var cardNumber: Long = 0
        private set(value) {            // делаем сеттер приватным, чтобы было невозможно менять значение параметра из вне
            if (value in 1000_0000_0000_0000L..9999_9999_9999_9999L) {
                field = value
                setFormattedCardNumber(value)
            } else {
                println("Некорректный номер карты")
                field = 0
            }
        }
        get() {
            println("Номер карты: $formattedCardNumber")
            return field
        }


    private var formattedCardNumber: String = ""

    private fun setFormattedCardNumber(value: Long) {      // Метод задания номера карты в привычном формате 0000 0000 0000 0000
        var temp = value
        var text = 0
        var devider = 1L
        for (i in 3 downTo 0) {
            devider = Math.pow(10.0, 4.0 * i).toLong()
            text = (temp / Math.pow(10.0, 4.0 * i)).toInt()
            temp %= devider

            formattedCardNumber += text
            formattedCardNumber += " "
        }
        formattedCardNumber = formattedCardNumber.trim()
    }

    private var pin = "0000"
    private var password: String = "12345678"

    fun setPin(pin: String) {
        if (haveAccess) {
            if (pin.length == 4 && pin.matches("""\d\d\d\d""".toRegex())) {
                this.pin = pin
                println("PIN-код успешно установлен")
            } else {(println("ПИН-код должен содержать 4 цифры"))}
            haveAccess = false
        } else println("Доступ запрещен.")
    }

    fun setPassword(password: String) {
        if (haveAccess) {
            this.password = password
            println("Пароль успешно установлен")
        } else println("Доступ запрещен.")
        haveAccess = false
    }

    private var haveAccess = false

    fun getAccess(password: String) {
        if (password.equals(this.password)) {
            println("Доступ разрешен, вам доступны просмотр всех данных карты, установка пин-кода, уставка пароля.")
            haveAccess = true
        } else println("Доступ запрещен.")

    }

    fun cardInfo() {

        if (haveAccess) {
            println("Номер карты: $formattedCardNumber")
            println("Pin-код: $pin")
            println("Пароль: $password")
        } else println("Доступ запрещен.")

        haveAccess = false

    }

    fun cardInfo(password: String) {
        getAccess(password)
        cardInfo()
    }

}