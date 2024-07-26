package Innerclassesandinterfaces.task1

class Human(val name: String) {

    inner class Head() {
        fun think() = println("$name думает головой")
    }

    inner class Legs() {
        fun run() = println("$name бежит")
        fun walk() = println("$name ходит")
        fun sit() = println("$name сидит")
    }

    inner class Hands() {
        fun use(item: String) = println("$name использует $item")
    }

}