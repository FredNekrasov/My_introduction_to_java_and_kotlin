package kotlinf.pws.fifthPW.printingData

import kotlinf.pws.fifthPW.database.IOperations
import kotlinf.pws.fifthPW.database.PracticalWork

class Print(private val db: IOperations): IPrintAll, IPrintList {
    override fun printAll() {
        db.getData().forEachIndexed { index, practicalWork -> println("${index + 1}. Name: ${practicalWork.pwName}, Student: ${practicalWork.student}, Variant Number: ${practicalWork.variantNumber}, " + "Level Number: ${practicalWork.levelNumber}, Submission Date: ${practicalWork.date}, Grade: ${practicalWork.mark}") }
    }
    override fun printL(inf: List<PracticalWork>) {
        inf.forEachIndexed { index, practicalWork -> println("${index + 1}. Name: ${practicalWork.pwName}, Student: ${practicalWork.student}, Variant Number: ${practicalWork.variantNumber}, " + "Level Number: ${practicalWork.levelNumber}, Submission Date: ${practicalWork.date}, Grade: ${practicalWork.mark}") }
    }
}