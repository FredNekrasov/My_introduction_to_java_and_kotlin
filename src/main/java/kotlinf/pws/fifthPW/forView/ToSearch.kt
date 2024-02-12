package kotlinf.pws.fifthPW.forView

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.database.PracticalWork
import kotlinf.pws.fifthPW.printingData.Print

class ToSearch {
    companion object {
        fun<T> search(inf:String, db: IOperations, printInf: Print, check:(String) -> T?, field: (PracticalWork) -> T): Int? {
            printInf.printInfo(inf)
            val index = readlnOrNull().let { if (it != null) check(it) else { printInf.printInfo(Comments.NULL); return null } }
            if (index == null) printInf.printInfo(Comments.ERROR) else printInf.printL(db.findByField(field, index))
            return 0
        }
    }
}