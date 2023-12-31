package kotlinf.pws.fifthPW.printingData

import kotlinf.pws.fifthPW.database.PracticalWork

interface IPrintList {
    fun printL(inf: List<PracticalWork>)
}