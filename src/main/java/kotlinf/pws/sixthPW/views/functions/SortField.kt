package kotlinf.pws.sixthPW.views.functions

import kotlinf.pws.sixthPW.database.IOperations
import kotlinf.pws.sixthPW.database.PracticalWork
import kotlinf.pws.sixthPW.printingData.IPrintList

class SortField {
    companion object {
        fun<T: Comparable<T>> sort(printInf: IPrintList, db: IOperations, field: (PracticalWork) -> (T)) {
            printInf.printL(db.sortByField(field))
        }
    }
}