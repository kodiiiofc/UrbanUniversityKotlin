package inheritance.task2

fun main() {
    val unnamedSmartphone = Smartphone()
    unnamedSmartphone.aboutPhone()
    unnamedSmartphone.toCall()

    println("------------------------")

    val iPhone = IPhone();
    iPhone.model = "15"
    iPhone.weight = 171
    iPhone.height = 147.6
    iPhone.width = 71.6
    iPhone.thickness = 7.8
    iPhone.aboutPhone()
    iPhone.toCall()

    println("------------------------")

    val nokia = Nokia();
    nokia.model = "Lumia 1020"
    nokia.weight = 158
    nokia.height = 130.4
    nokia.width = 71.4
    nokia.thickness = 10.4
    nokia.aboutPhone()
    nokia.toCall()

    println("------------------------")

    val sony = Sony();
    sony.model = "Xperia XZ1"
    sony.weight = 156
    sony.height = 148.0
    sony.width = 73.0
    sony.thickness = 7.4
    sony.aboutPhone()
    sony.toCall()



}