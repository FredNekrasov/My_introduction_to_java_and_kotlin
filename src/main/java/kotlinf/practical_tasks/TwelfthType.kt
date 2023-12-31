package kotlinf.practical_tasks

//Создайте generic-класс, который позволяет добавлять, удалять элементы из списка, выводить на экран список. Тип данных, хранящийся в списке — параметр generic класса.
class TwelfthType<in T>() {
    private val list = mutableListOf<T>()
    fun add(inf: T): Boolean = list.add(inf)
    fun delete(inf: T): Boolean = list.remove(inf)
    fun printList() = list.forEach { println(it) }
}