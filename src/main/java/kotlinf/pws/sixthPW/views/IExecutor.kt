package kotlinf.pws.sixthPW.views

interface IExecutor {
    fun edit(): Boolean
    fun search(): Boolean
    fun sort(): Boolean
    fun delete(): Boolean
    fun scan(): Boolean
    fun printData()
}