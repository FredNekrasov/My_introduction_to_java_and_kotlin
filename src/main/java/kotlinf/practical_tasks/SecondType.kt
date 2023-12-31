package kotlinf.practical_tasks

class SecondType {
//Разработайте программу, осуществляющую нахождение цифр, которые входят в каждое из данных натуральных чисел.
    fun task1(){
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .split(" ")
                .let { values ->
                    values.flatMap { it.toSet() }.groupBy { it }.filterValues { it.size == values.size }.keys.let { println(it) }
                }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение цифр, которые входят хотя бы в два из данных натуральных чисел.
    fun task2(){
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .split(" ")
                .let { values ->
                    values.flatMap { it.toSet() }.groupBy { it }.filterValues { it.size == 2 }.keys.let { println(it) }
                }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение цифр, которые входят ровно в одно из данных натуральных чисел.
    fun task3(){
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .split(" ")
                .let { values ->
                    values.flatMap { it.toSet() }.groupBy { it }.filterValues { it.size == 1 }.keys.let { println(it) }
                }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение цифр, которые входят ровно в два из данных натуральных чисел.
    fun task4(){
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .split(" ")
                .let { values ->
                    values.flatMap { it.toSet() }.groupBy { it }.filterValues { it.size == 2 }.keys.let { println(it) }
                }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
}