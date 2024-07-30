package delegation


fun main() {
    println(isPalindrome("дом"))
    println(isPalindrome("массив"))
    println(isPalindrome("казак"))
    println(isPalindrome("довод"))

}

fun isPalindrome(s: String): Boolean {

    val range = 0..s.length / 2 - 1

    for (i in range) {
        if (s[i] != s[s.length - 1 - i]) return false
    }

    return true
}