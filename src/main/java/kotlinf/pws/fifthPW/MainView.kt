package kotlinf.pws.fifthPW

import kotlinf.pws.fifthPW.database.Database
import kotlinf.pws.fifthPW.printingData.Print
import kotlinf.pws.fifthPW.views.*

fun main() {
    val db = Database()
    val printInf = Print(db)
    var choice: Int?
    while (true){
        println(Comments.ACTIONS)
        choice = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return } }
        if ((choice != null) && (choice > 0)){
            when (choice) {
                1 -> if (!scan(db)) return
                2 -> if (!edit(db)) return
                3 -> if (!delete(db)) return
                4 -> if (!sort(db, printInf)) return
                5 -> if (!search(db, printInf)) return
                6 -> printInf.printAll()
                7 -> return
                else -> println(Comments.INCORRECT_CHOICE)
            }
        } else println(Comments.WRONG_CHOICE)
    }
}