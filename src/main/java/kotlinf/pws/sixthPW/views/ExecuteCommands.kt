package kotlinf.pws.sixthPW.views

import javax.inject.Inject

class CreateCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        if (!view.scan()) return
    }
}
class ReadCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        view.printData()
    }
}
class UpdateCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        if(!view.edit()) return
    }
}
class DeleteCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        if(!view.delete()) return
    }
}
class SortCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        if(!view.sort()) return
    }
}
class SearchCommand @Inject constructor(private val view: IExecutor) : IExecute {
    override fun execute() {
        if(!view.search()) return
    }
}