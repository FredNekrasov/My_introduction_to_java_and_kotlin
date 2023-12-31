package kotlinf.pws.sixthPW.database

interface IOperations {
    fun add(pw: PracticalWork): String
    fun update(index: Int, pw: PracticalWork): String
    fun delete(index: Int): String
    fun<T : Comparable<T>> sortByField(field: (PracticalWork) -> T): List<PracticalWork>
    fun<T> findByField(field: (PracticalWork) -> T, value: T): List<PracticalWork>
    fun getData(): List<PracticalWork>
}