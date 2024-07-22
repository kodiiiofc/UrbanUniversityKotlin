package abstractclasses

fun main() {
    println(convertTo(1, 1.13))
    println(convertTo(2, 1.13))
    println(convertTo(3, 1.13))
    println(convertTo(4, 1.13))
    println(convertTo(5, 1.13))
    println(convertTo(6, 1.13))
}

fun convertTo(dmIs1_kmIs2_mIs3_mmIs4_cmIs5 : Int, lengthInMeters : Double) : Double {
    return when {
        dmIs1_kmIs2_mIs3_mmIs4_cmIs5 == 1 -> lengthInMeters * 10
        dmIs1_kmIs2_mIs3_mmIs4_cmIs5 == 2 -> lengthInMeters / 1000
        dmIs1_kmIs2_mIs3_mmIs4_cmIs5 == 4 -> lengthInMeters * 1000
        dmIs1_kmIs2_mIs3_mmIs4_cmIs5 == 5 -> lengthInMeters * 100
        else -> lengthInMeters
    }

}