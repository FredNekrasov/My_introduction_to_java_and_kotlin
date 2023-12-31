package kotlinf.pws.sixthPW.views

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.sixthPW.dataVerification.*
import kotlinf.pws.sixthPW.database.*
import kotlinf.pws.sixthPW.printingData.IPrintList
import kotlinf.pws.sixthPW.views.functions.*
import java.time.LocalDate
import javax.inject.Inject

class Executor @Inject constructor(
    private val db: IOperations,
    private val printInf: IPrintList,
    private val checkPW: IPW,
    private val checkStudent: IStudent,
    private val checkVariant: IVariant,
    private val checkLVL: ILvl,
    private val checkDate: IDate,
    private val checkMark: IMark
): IExecutor {
    override fun scan(): Boolean {
        val pwName = DataEntry.dataEntry(Comments.PW_NAME, { checkPW.check(it) }, "")
        if (pwName == "") return false
        val student = DataEntry.dataEntry(Comments.STUDENT, { checkStudent.check(it) }, "")
        if (student == "") return false
        val variant = DataEntry.dataEntry(Comments.VARIANT, { checkVariant.check(it) }, 0)
        if (variant == 0) return false
        val lvl = DataEntry.dataEntry(Comments.LVL, { checkLVL.check(it) }, 0)
        if (lvl == 0) return false
        val completionDate = DataEntry.dataEntry(Comments.DATE, { checkDate.check(it) }, LocalDate.of(2000, 1, 1))
        if (completionDate == LocalDate.of(2000, 1, 1)) return false
        val mark = DataEntry.dataEntry(Comments.MARK, { checkMark.check(it) }, 0)
        if (mark == 0) return false
        if (pwName.isNullOrBlank() || student.isNullOrBlank() || (variant == null) || (lvl == null) || (completionDate == null) || (mark == null)) println(Comments.SOMETHING_WRONG)
        else println(db.add(PracticalWork(pwName, student, variant, lvl, completionDate, mark)))
        return true
    }
    override fun delete(): Boolean {
        println(Comments.INDEX)
        val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
        if (index == null || index < 0) println(Comments.ERROR)
        else println(db.delete(index))
        return true
    }
    override fun sort(): Boolean {
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
    override fun search(): Boolean {
        println("${Comments.SEARCH}\n ${Comments.ACTIONS2}")
        val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
        when(index){
            null -> println(Comments.ERROR)
            1 -> ToSearch.search(Comments.PW_NAME, db, printInf, { checkPW.check(it) }, { it.pwName }) ?: return false
            2 -> ToSearch.search(Comments.STUDENT, db, printInf, { checkStudent.check(it) }, { it.student }) ?: return false
            3 -> ToSearch.search(Comments.VARIANT, db, printInf, { checkVariant.check(it) }, { it.variantNumber }) ?: return false
            4 -> ToSearch.search(Comments.LVL, db, printInf, { checkLVL.check(it) }, { it.levelNumber }) ?: return false
            5 -> ToSearch.search(Comments.DATE, db, printInf, { checkDate.check(it) }, { it.date }) ?: return false
            6 -> ToSearch.search(Comments.MARK, db, printInf, { checkMark.check(it) }, { it.mark }) ?: return false
            else -> println(Comments.INCORRECT_CHOICE)
        }
        return true
    }
    override fun edit(): Boolean {
        println(Comments.INDEX)
        val index = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return false } }
        when {
            index == null || index < 0 -> println(Comments.ERROR)
            index !in db.getData().indices -> println(Comments.INDEX_ERROR)
            else -> {
                val pwName = DataEntry.dataEntry(Comments.PW_NAME, { checkPW.check(it) }, "")
                if (pwName == "") return false
                val student = DataEntry.dataEntry(Comments.STUDENT, { checkStudent.check(it) }, "")
                if (student == "") return false
                val variant = DataEntry.dataEntry(Comments.VARIANT, { checkVariant.check(it) }, 0)
                if (variant == 0) return false
                val lvl = DataEntry.dataEntry(Comments.LVL, { checkLVL.check(it) }, 0)
                if (lvl == 0) return false
                val completionDate = DataEntry.dataEntry(Comments.DATE, { checkDate.check(it) }, LocalDate.of(2000, 1, 1))
                if (completionDate == LocalDate.of(2000, 1, 1)) return false
                val mark = DataEntry.dataEntry(Comments.MARK, { checkMark.check(it) }, 0)
                if (mark == 0) return false
                if (pwName.isNullOrBlank() || student.isNullOrBlank() || (variant == null) || (lvl == null) || (completionDate == null) || (mark == null)) println(Comments.SOMETHING_WRONG)
                else println(db.update(index, PracticalWork(pwName, student, variant, lvl, completionDate, mark)))
            }
        }
        return true
    }
    override fun printData() = printInf.printL(db.getData())
}