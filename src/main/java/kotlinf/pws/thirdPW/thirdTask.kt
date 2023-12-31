package kotlinf.pws.thirdPW

//Реализуйте задания No3 первой практической работы с использованием функционального подхода в одно выражение каждое (без учета ввода-вывода).
fun main() {
    readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").filter { y -> y.count() % 2 == 0 }.maxByOrNull { y -> y.length }?.lastOrNull().let { z -> println(z) } } else println("Error: String is empty") }
}