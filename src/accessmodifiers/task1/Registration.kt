package accessmodifiers.task1

class Registration(private var email: String) {
    private var password: String = "password"


    fun getEmail() = email.uppercase()

    fun setPassword(password: String) {
        if (password.length < 6) {
            println("Длина пароля не должна быть менее 6 символов")
        } else {
            println("Пароль установлен")
            this.password = password
        }
    }

}