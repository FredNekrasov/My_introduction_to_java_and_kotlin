package kotlinf.pws.sixthPW.views.functions

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.sixthPW.database.IOperations
import kotlinf.pws.sixthPW.database.PracticalWork
import kotlinf.pws.sixthPW.printingData.IPrintList

class ToSearch {
    companion object {
        fun<T> search(inf:String, db: IOperations, printInf: IPrintList, check:(String) -> T?, field: (PracticalWork) -> T): Int? {
            println(inf)
            val index = readlnOrNull().let { if (it != null) check(it) else { println(Comments.NULL); return null } }
            if (index == null) println(Comments.ERROR) else printInf.printL(db.findByField(field, index))
            return 0
        }
    }
}