package kotlinf.pws.seventhPW

//fun insert (el: T, n: Int): Bool вставляет элемент на позицию n (нумерация идет с единицы) с начала списка;
//fun delete (n: Int): Bool удаляет элемент с позиции n |fun print():Unit печатает все элементы
//Кроме того должна быть реализована функция eraseAll, которая очищает весь список.
//Список должен быть реализован в виде generic-класса
class ItemList<T> : IRemoveIL, IPrintList, IClearList {
    private val itemList = mutableListOf<T>()
    fun add(el: T) = itemList.add(el)
    fun insert(el: T, n: Int): Boolean {
        return if (n in itemList.indices){
            itemList.add(n, el)
            true
        } else false
    }
    override fun delete(n: Int): Boolean {
        return if (n in itemList.indices) {
            itemList.removeAt(n)
            true
        } else false
    }
    override fun printAll() = itemList.forEachIndexed { index, item -> println("$index $item") }
    override fun eraseAll() = itemList.clear()
}