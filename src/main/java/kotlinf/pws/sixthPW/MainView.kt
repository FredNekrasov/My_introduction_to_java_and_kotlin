package kotlinf.pws.sixthPW

import kotlinf.pws.fifthPW.Comments
import kotlinf.pws.sixthPW.views.IExecute
import kotlinf.pws.sixthPW.views.Menu

fun main() {
    val menu = DaggerAppComponent.builder().build().getMenu().commandList
    mainView(menu)
}
fun mainView(items : List<IExecute>) {
    var choice: Int? = 0
    val menuItem = Menu(items)
    while (choice != 7){
        println(Comments.ACTIONS)
        choice = readlnOrNull().let { if (it != null) it.toIntOrNull() else { println(Comments.NULL); return } }
        if ((choice != null) && (choice > 0)) menuItem.executeCommand(choice - 1) else println(Comments.WRONG_CHOICE)
    }
}//Надо исправить это