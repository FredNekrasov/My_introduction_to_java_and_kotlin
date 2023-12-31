package kotlinf.pws.fifthPW.database

import java.time.LocalDate

data class PracticalWork(
    val pwName: String,
    val student: String,
    val variantNumber: Int,
    val levelNumber: Int,
    val date: LocalDate,
    val mark: Int
)