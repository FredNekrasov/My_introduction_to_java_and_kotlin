package kotlinf.pws.fifthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.dataVerification.Verifier
import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.forView.ToSearch
import kotlinf.pws.fifthPW.printingData.Print

fun search(db: IOperations, printInf: Print): Boolean {
    val verifier = Verifier()
    println("${Comments.SEARCH}\n ${Comments.ACTIONS2}")
    val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
    when(index){
        null -> println(Comments.ERROR)
        1 -> ToSearch.search(Comments.PW_NAME, db, printInf, { verifier.checkString(it) }, { it.pwName }) ?: return false
        2 -> ToSearch.search(Comments.STUDENT, db, printInf, { verifier.checkString(it) }, { it.student }) ?: return false
        3 -> ToSearch.search(Comments.VARIANT, db, printInf, { verifier.checkInt(it) }, { it.variantNumber }) ?: return false
        4 -> ToSearch.search(Comments.LVL, db, printInf, { verifier.checkInt(it) }, { it.levelNumber }) ?: return false
        5 -> ToSearch.search(Comments.DATE, db, printInf, { verifier.checkDate(it) }, { it.date }) ?: return false
        6 -> ToSearch.search(Comments.MARK, db, printInf, { verifier.checkMark(it) }, { it.mark }) ?: return false
        else -> println(Comments.INCORRECT_CHOICE)
    }
    return true
}