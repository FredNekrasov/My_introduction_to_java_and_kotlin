package kotlinf.course.polymorphism

import java.util.*

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String): NotesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}