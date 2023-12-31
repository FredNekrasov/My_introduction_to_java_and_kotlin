package kotlinf.practical_tasks

class SeventhType {
//Разработайте программу, осуществляющую суммирование чётных цифр данного натурального числа.
    fun task1() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .map { it.digitToIntOrNull() }.map { it ?: return }
                .filter { it % 2 == 0 }.sum().let { println(it) }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение произведения чётных цифр данного натурального числа.
    fun task2() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .map { it.digitToIntOrNull() }.map { it ?: return }
                .filter { it % 2 == 0 }.reduceRight { i, acc -> i * acc } .let { println(it) }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение максимальной чётной цифры данного натурального числа.
    fun task3() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .map { it.digitToIntOrNull() }.map { it ?: return }
                .filter { it % 2 == 0 }.maxOf { it }.let { println(it) }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую нахождение минимальной чётной цифры данного натурального числа.
    fun task4() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .map { it.digitToIntOrNull() }.map { it ?: return }
                .filter { it % 2 == 0 }.minOf { it }.let { println(it) }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
//Разработайте программу, осуществляющую суммирование нечётных цифр данного натурального числа.
    fun task5() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string
                .map { it.digitToIntOrNull() }.map { it ?: return }
                .filter { it % 2 != 0 }.sum().let { println(it) }
        else println("Error: String is empty") } ?: println("Error: String is null")
    }
}