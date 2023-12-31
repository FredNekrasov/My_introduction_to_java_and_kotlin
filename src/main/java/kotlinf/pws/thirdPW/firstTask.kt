package kotlinf.pws.thirdPW

//Реализуйте задания No1 первой практической работы с использованием функционального подхода в одно выражение каждое (без учета ввода-вывода).
fun main() {
    readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) it.toString().map { x -> x.digitToInt() }.filter { y -> y % 3 != 0 }.sum().let { z -> println(z) } else println("Error: The number is null ") }
}