package kotlinf.pws.fifthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.forView.SortField
import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.printingData.Print

fun sort(db: IOperations, printInf: Print): Boolean {
    println("${Comments.SORTING}\n ${Comments.ACTIONS2}")
    val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
    when(index){
        null -> println(Comments.ERROR)
        1 -> SortField.sort(printInf, db){ it.pwName }
        2 -> SortField.sort(printInf, db){ it.student }
        3 -> SortField.sort(printInf, db){ it.variantNumber }
        4 -> SortField.sort(printInf, db){ it.levelNumber }
        5 -> SortField.sort(printInf, db){ it.date }
        6 -> SortField.sort(printInf, db){ it.mark }
        else -> println(Comments.INCORRECT_CHOICE)
    }
    return true
}