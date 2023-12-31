package kotlinf.pws.sixthPW.database

import kotlinf.pws.fifthPW.Comments
import javax.inject.Inject

class Database @Inject constructor() : IOperations {
    private val practicalWorks = mutableListOf<PracticalWork>()
    override fun getData() = practicalWorks.toList()
    override fun add(pw: PracticalWork): String {
        practicalWorks.add(pw)
        return "The record was created successfully"
    }
    override fun delete(index: Int): String {
        return if (index in practicalWorks.indices) {
            practicalWorks.removeAt(index)
            "The record has been deleted"
        } else Comments.INDEX_ERROR
    }
    override fun update(index: Int, pw: PracticalWork): String {
        practicalWorks[index] = pw
        return "The record has been updated"
    }
    override fun <T> findByField(field: (PracticalWork) -> T, value: T): List<PracticalWork> {
        return practicalWorks.filter { field(it) == value }.toList()
    }
    override fun <T : Comparable<T>> sortByField(field: (PracticalWork) -> T): List<PracticalWork> {
        return practicalWorks.sortedBy(field).toList()
    }
}