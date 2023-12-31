package kotlinf.pws.sixthPW.dataVerification

import java.time.LocalDate

interface IPW {
    fun check(inf: String?): String?
}
interface IStudent {
    fun check(inf: String?): String?
}
interface IVariant {
    fun check(inf: String?): Int?
}
interface ILvl {
    fun check(inf: String?): Int?
}
interface IDate {
    fun check(inf: String?): LocalDate?
}
interface IMark {
    fun check(inf: String?): Int?
}