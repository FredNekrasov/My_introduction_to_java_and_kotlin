package kotlinf.pws.sixthPW.printingData

import kotlinf.pws.sixthPW.database.PracticalWork

interface IPrintList {
    fun printL(inf: List<PracticalWork>)
}