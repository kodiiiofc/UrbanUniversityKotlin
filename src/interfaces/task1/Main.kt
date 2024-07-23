package interfaces.task1

fun main() {
    val ambulanceService = AmbulanceService()
    ambulanceService.getDescription()
    ambulanceService.emergencyCall()

    val policeService = PoliceService()
    policeService.getDescription()
    policeService.emergencyCall()
}