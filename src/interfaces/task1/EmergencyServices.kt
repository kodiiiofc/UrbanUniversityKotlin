package interfaces.task1

abstract class EmergencyServices(
    val name: String,
    val phone: Byte
) : HasDescription {
    abstract fun emergencyCall()
}