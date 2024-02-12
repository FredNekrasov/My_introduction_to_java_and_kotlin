package kotlinf.pws.fifthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.printingData.Print

fun sort(db: IOperations, printInf: Print): Boolean {
    printInf.printInfo("${Comments.SORTING}\n ${Comments.ACTIONS2}")
    val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { printInf.printInfo(Comments.NULL); return false } }
    when(index){
        null -> printInf.printInfo(Comments.ERROR)
        1 -> printInf.printL(db.sortByField { it.pwName })
        2 -> printInf.printL(db.sortByField { it.student })
        3 -> printInf.printL(db.sortByField { it.variantNumber })
        4 -> printInf.printL(db.sortByField { it.levelNumber })
        5 -> printInf.printL(db.sortByField { it.date })
        6 -> printInf.printL(db.sortByField { it.mark })
        else -> printInf.printInfo(Comments.INCORRECT_CHOICE)
    }
    return true
}