package kotlinf.practical_tasks

class FifthType {
//Разработайте программу нахождения первого символа в первом максимально длинном слове с нечетным числом символов в строке.
    fun task1(){
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.firstOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
//Разработайте программу нахождения последнего символа в первом максимально длинном слове с нечетным числом символов в строке.
    fun task2(){
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.lastOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
//Разработайте программу нахождения первого символа в последнем максимально длинном слове с нечетным числом символов в строке.
    fun task3(){
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").reversed().filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.firstOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
//Разработайте программу нахождения последнего символа в последнем максимально длинном слове с нечетным числом символов в строке.
    fun task4(){
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").reversed().filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.lastOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
//Разработайте программу нахождения первого символа в первом максимально коротком слове с нечетным числом символов в строке.
    fun task5(){
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").filter { y -> y.count() % 2 != 0 }.minByOrNull { y -> y.length }?.firstOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
}