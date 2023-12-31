package kotlinf.pws.fifthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.fifthPW.dataVerification.Verifier
import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.database.PracticalWork
import kotlinf.pws.fifthPW.forView.DataEntry
import java.time.LocalDate

fun scan(db: IOperations): Boolean {
    val verifier = Verifier()
    val pwName = DataEntry.dataEntry(Comments.PW_NAME, { verifier.checkString(it) }, "")
    if (pwName == "") return false
    val student = DataEntry.dataEntry(Comments.STUDENT, { verifier.checkString(it) }, "")
    if (student == "") return false
    val variant = DataEntry.dataEntry(Comments.VARIANT, { verifier.checkInt(it) }, 0)
    if (variant == 0) return false
    val lvl = DataEntry.dataEntry(Comments.LVL, { verifier.checkInt(it) }, 0)
    if (lvl == 0) return false
    val completionDate = DataEntry.dataEntry(Comments.DATE, { verifier.checkDate(it) }, LocalDate.of(2000, 1, 1))
    if (completionDate == LocalDate.of(2000, 1, 1)) return false
    val mark = DataEntry.dataEntry(Comments.MARK, { verifier.checkMark(it) }, 0)
    if (mark == 0) return false
    if (pwName.isNullOrBlank() || student.isNullOrBlank() || (variant == null) || (lvl == null) || (completionDate == null) || (mark == null)) println(Comments.SOMETHING_WRONG)
    else println(db.add(PracticalWork(pwName, student, variant, lvl, completionDate, mark)))
    return true
}