package kotlinf.pws.sixthPW.printingData

import kotlinf.pws.sixthPW.database.PracticalWork
import javax.inject.Inject

class Print @Inject constructor(): IPrintList {
    override fun printL(inf: List<PracticalWork>) = inf.forEachIndexed { index, practicalWork ->
        println("${index + 1}. Name: ${practicalWork.pwName}, Student: ${practicalWork.student}, Variant Number: ${practicalWork.variantNumber}, " + "Level Number: ${practicalWork.levelNumber}, Submission Date: ${practicalWork.date}, Grade: ${practicalWork.mark}")
    }
}