package kotlinf.pws.sixthPW.views.functions

import kotlinf.pws.fifthPW.Comments

class DataEntry {
    companion object {
        fun<T> dataEntry(inf: String, check: (String) -> T?, result: T): T? {
            println(inf)
            val i = readlnOrNull().let { if (it == null) { println(Comments.NULL); return result } else check(it) }
            if (i == null) println(Comments.ERROR)
            return i
        }
    }
}