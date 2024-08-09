package nullandnullabletypes

fun main() {
    favoriteBook("Башня ласточки")
    favoriteBook(null)
}

fun favoriteBook(nameOfBook: String?) {
    println(nameOfBook?: "У меня нет любимой книги")
}