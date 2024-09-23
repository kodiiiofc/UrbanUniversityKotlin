package anynothingunitpairtriple


fun main() {

    val str1 = "{([])}"
    val str2 = "{([))}"
    val str3 = "{{[])}"
    val str4 = "<{([])}>"
    val str5 = "((([]))"
    val str6 = "({  ([ d]da)})"

    println("String $str1 is correct: ${checkBrackets(str1)}")
    println("String $str2 is correct: ${checkBrackets(str2)}")
    println("String $str3 is correct: ${checkBrackets(str3)}")
    println("String $str4 is correct: ${checkBrackets(str4)}")
    println("String $str5 is correct: ${checkBrackets(str5)}")
    println("String $str6 is correct: ${checkBrackets(str6)}")

}

fun checkBrackets(string: String): Boolean {
    val leftBrackets = "({[<"
    val rightBrackets = "({[<"

    val expectedBracket = { char: Char ->
        when (char) {
            '{' -> '}'
            '(' -> ')'
            '[' -> ']'
            '<' -> '>'
            else -> '\u0000'
        }
    }

    val bracketList: MutableList<Char> = mutableListOf()


    for (char in string) {
        if (char in leftBrackets) {
            bracketList.add(char)
        } else if (char == expectedBracket(bracketList.last())) {
            bracketList.removeLast()
        } else if (char in rightBrackets) {
            return false
        }
    }

    if (bracketList.isNotEmpty()) return false

    return true
}

