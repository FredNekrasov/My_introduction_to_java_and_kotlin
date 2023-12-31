package kotlinf.pws.secondPW

/*Создайте функцию, которая по данным функциям с параметром типа Int и результатами типа Int возвращает новую функцию с аргументом x типа Int,
которая возвращает номер последней функции, имеющей минимальное значение, при подстановке в качестве аргумента x.*/
fun findMinValue(vararg functions: (Int) -> Int): (Int) -> Int {
    if (functions.isEmpty()) return {x: Int -> Int.MAX_VALUE - x}
    else return { x: Int ->
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
fun main() {
    val a = readlnOrNull()?.toIntOrNull()
    if (a == null) println("Error")
    else println(findMinValue({ x -> x + 1}, { x -> x * 3}, { x -> x + 1})(a))
}