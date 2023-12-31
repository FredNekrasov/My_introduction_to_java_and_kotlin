package kotlinf.pws.fifthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.database.IOperations

fun delete(db: IOperations): Boolean {
    println(Comments.INDEX)
    val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
    if (index == null || index < 0) println(Comments.ERROR)
    else println(db.delete(index))
    return true
}