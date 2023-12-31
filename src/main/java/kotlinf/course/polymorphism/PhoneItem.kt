package kotlinf.course.polymorphism

import java.util.*

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long): NotesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}