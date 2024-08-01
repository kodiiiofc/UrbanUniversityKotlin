package highorderfunctions

fun main() {
    val colorOne = "#0f0000"
    val colorTwo = "#00000f"

    println(action(colorOne, colorTwo, ::colorMixer))

}


fun action(colorOne: String, colorTwo: String, mixer: (String, String) -> String) : String {
    return mixer(colorOne, colorTwo)
}


fun colorMixer(colorOne: String, colorTwo: String) : String {

    val redHex = mixColor(colorOne, colorTwo, "red")
    val greenHex = mixColor(colorOne, colorTwo, "green")
    val blueHex = mixColor(colorOne, colorTwo, "blue")

    return "#$redHex$greenHex$blueHex"
}

fun subColor(hexColorCode: String, subColor: String) : Int {

    val colorIndexes = when (subColor) {
        "red" -> 1..2
        "green" -> 3..4
        "blue" -> 5..6
        else -> 0..0
    }

    return hexColorCode.substring(colorIndexes).toInt(16)
}

fun mixColor(colorOne: String, colorTwo: String, basicColor: String) : String {
    var colorHex = ((subColor(colorOne, basicColor) + subColor(colorTwo, basicColor)) / 2).toString(16)
    if (colorHex.length == 1) colorHex = "0" + colorHex
    return colorHex
}