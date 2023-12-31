package kotlinf.pws.fifthPW.forView

import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.database.PracticalWork
import kotlinf.pws.fifthPW.printingData.Print

class SortField {
    companion object {
        fun<T: Comparable<T>> sort(printInf: Print, db: IOperations, field: (PracticalWork) -> (T)) {
            printInf.printL(db.sortByField(field))
        }
    }
}