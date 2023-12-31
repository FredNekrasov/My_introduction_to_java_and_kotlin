package kotlinf.pws.seventhPW

class Tasks {
    fun task1() {
        println(minFunction(9, {x: Int -> x + 4}, {x: Int -> x + 5}, {x: Int -> x - 4}))
    }
    private fun<T> minFunction(x: T, vararg functions: (T) -> Int): Int? {
        return if (functions.isEmpty()) null
        else {
            var minValue = functions[functions.lastIndex](x)
            var index = functions.lastIndex
            for (i in functions.indices) {
                val currentValue = functions[i](x)
                if (minValue > currentValue) {
                    minValue = currentValue
                    index = i
                }
            }
            index
        }
    }
    fun task2() {
        val list = ItemList<String>()
        list.add("qwerty")
        list.add("0987654")
        list.add("true")
        list.printAll()
        list.insert("Hello World", 0)
        list.insert("1234567890", 1)
        println(list.insert("123456789f", 2))
        list.printAll()
        println(list.delete(1))
        list.printAll()
        list.eraseAll()
        list.printAll()
    }
}