package kotlinf.practical_tasks

class TenthType {
//Разработайте программу, которая по номеру числа Фибоначчи находит число Фибоначчи с использованием строгого функционального подхода.
    fun task1(){
        readlnOrNull()?.toIntOrNull()
            .let { value ->
                if ((value != null) && (value >= 0)) generateSequence(0 to 1) { it.second to it.first + it.second }
                    .map { it.first }.take(value + 1).last().let { println(it) }
                else println("Error")
            }
    }
//Разработайте программу, которая по числу Фибоначчи находит его номер с использованием строгого функционального подхода.
    fun task2(){
        readlnOrNull()?.toIntOrNull()
            .let { value ->
                if ((value != null) && (value >= 0)) generateSequence(0 to 1) { it.second to it.first + it.second }
                    .indexOfFirst {
                        if (it.second > value) {
                            println("Error: Entered number is not a fibonacci number"); return
                        } else it.second == value
                    }.let { println(it + 1) }
                else println("Error")
            }
    }
//Разработайте программу, которая по числу находит его факториал с использованием строгого функционального подхода.
    fun task3(){
        readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) generateSequence(1 to it){ x -> x.first + 1 to x.second * x.first }.filter { y -> y.first == it }.first().second.let { z -> println(z) } else println("Error") }
}
//Разработайте программу, которая по факториалу числа находит исходное число с использованием строгого функционального подхода.
    fun task4(){
        readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) generateSequence(1 to 1) { x -> x.first + 1 to x.second * x.first }.filter { y -> y.second >= it }.first().let { numbers -> if (numbers.second == it) println(numbers.first - 1) else println("Error: Entered number is not a factorial") } else println("Error") }
    }
//Разработайте программу, которая по числу n находит простое число с номером n в последовательности всех простых чисел, отсортированных в порядке возрастания с использованием строгого функционального подхода.
    fun task5(){
    }
}