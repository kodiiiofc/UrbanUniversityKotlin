package exceptions

fun main() {
    val userCatalog = UserCatalog()
    userCatalog.greeting()
    userCatalog.addUserDialog()
    println(userCatalog.getUserList().contentToString())
    println(userCatalog.getUserAtIndex(7))


}

class UserCatalog {

    class User(val firstName: String, val secondName: String) {

        companion object {
            val EMPTY_USER = User("empty", "empty")      // делаем "статического" пустого пользователя
            const val ILLEGAL_SYMBOLS = "!@#$%^&*()_+={}[]\\|/<>?,.`~1234567890"
        }

        override fun toString(): String {
            return (if (firstName == EMPTY_USER.firstName || secondName == EMPTY_USER.secondName) "Empty user"
            else "User: $firstName $secondName")
        }
    }

    private val listSize = 10

    private val list: Array<User> = Array(listSize) { User.EMPTY_USER }

    fun addUser(index: Int, firstName: String, secondName: String) {
        if (index >= list.size || index < 0) { // выкидываем исключение, если индекс вне диапазона массива
            throw UserCatalogIndexOutOfBoundsException()
        }

        if (firstName.isBlank() || secondName.isBlank()) throw IllegalUserPropertiesException() // исключение, если хотя бы одна строка пустая

        for (symbol in User.ILLEGAL_SYMBOLS) { // исключение, если строки содержат запрещенные символы
            if (symbol in firstName || symbol in secondName) {
                throw IllegalUserPropertiesException()
            }
        }

        if (list[index] != User.EMPTY_USER) { // уведомляем, что пользователь перезаписываем уже имеющегося пользователя
            println("You are rewriting User with index = $index: ${list[index].firstName} ${list[index].secondName}.")
            list[index] = User(firstName, secondName)
            println("User rewrote successfully.")
        } else {
            list[index] = User(firstName, secondName)
            println("User wrote successfully.")
        }

    }

    fun getUserList(): Array<User> {
        return list
    }

    fun getUserAtIndex(index: Int): User {
        return list[index]
    }

    fun addUserDialog() { // метод вместо createList(list: Array<String>)
            while (true) {
                println("Enter user's first name.")
                val firstName = readln()
                println("Enter user's second name.")
                val secondName = readln()
                println("What index do you want to place User at?")
                val index = readln().toInt()

                try {
                    addUser(index, firstName, secondName)
                } catch (e: Exception) {
                    when (e) {
                        is IllegalUserPropertiesException, is UserCatalogIndexOutOfBoundsException -> {
                            println(e.message)
                            println("Please, repeat.")
                        }

                        else -> throw e
                    }
                }

                println("Do you want to continue? No - for stop the program.")
                if (readln().lowercase() == "no") return

            }
    }

    fun greeting() {
        println("User catalog created for $listSize users")
    }
}


class UserCatalogIndexOutOfBoundsException : ArrayIndexOutOfBoundsException() { // исключение - вне диапозона
    override val message: String?
        get() = "Index of User is out of range of list."
}

class IllegalUserPropertiesException :
    IllegalArgumentException() { // исключение - пустая строка или содержит запрещенные символы
    override val message: String?
        get() = "String is empty or contains illegal symbols."
}