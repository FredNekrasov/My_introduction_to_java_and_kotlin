package kotlinf.pws.fifthPW.dataVerification

import java.time.LocalDate

interface CheckData {
    fun checkString(inf: String?): String?
    fun checkInt(inf: String?): Int?
    fun checkMark(inf: String?): Int?
    fun checkDate(inf: String?): LocalDate?
}