package genericsclassesandfunctions

fun main() {
    print("Hello!")
    print(15)
    print(313.11)
    print(arrayOf(13, 11, 12).contentToString())
    print(false)
}

fun <T> print(obj: T) = println(obj)