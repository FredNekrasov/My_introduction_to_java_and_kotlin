package kotlinf.pws.sixthPW.views

import javax.inject.Inject

class MenuBuilder @Inject constructor(add: CreateCommand, type: ReadCommand, edit: UpdateCommand, delete: DeleteCommand, sort: SortCommand, search: SearchCommand) {
    val commandList = listOf(add, edit, delete, sort, search, type)
}
class Menu(private val items: List<IExecute>) {
    fun executeCommand(i : Int) = items.getOrNull(i)?.execute()
}