package kotlinf.practical_tasks

class EighthType {
//Разработайте программу, осуществляющую побитовое И последней цифры данных натуральных чисел (если последней цифры нет, то число пропускается).
    fun task1(){
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ")
                .map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 1] else strings.single()}
                .map { number -> number.digitToInt() }
                .reduceRight { i, acc -> acc.and(i) }
                .let { result -> println(result) }
        }
    }
//Разработайте программу, осуществляющую побитовое ИЛИ последней цифры данных натуральных чисел (если последней цифры нет, то число пропускается).
    fun task2(){
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ")
                .map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 1] else strings.single()}
                .map { number -> number.digitToInt() }
                .reduceRight { i, acc -> acc.or(i) }
                .let { result -> println(result) }
        }
    }
//Разработайте программу, осуществляющую побитовое исключающее ИЛИ последней цифры данных натуральных чисел (если последней цифры нет, то число пропускается).
    fun task3(){
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ")
                .map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 2] else strings.single()}
                .map { number -> number.digitToInt() }
                .reduceRight { i, acc -> acc.xor(i) }
                .let { result -> println(result) }
        }
    }
//Разработайте программу, осуществляющую побитовое И последней цифры данных натуральных чисел.
    fun task4(){
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ")
                .map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 2] else strings.single()}
                .map { number -> number.digitToInt() }
                .reduceRight { i, acc -> acc.and(i) }
                .let { result -> println(result) }
        }
    }
//Разработайте программу, осуществляющую побитовое ИЛИ последней цифры данных натуральных чисел.
    fun task5(){
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ")
                .map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 2] else strings.single()}
                .map { number -> number.digitToInt() }
                .reduceRight { i, acc -> acc.or(i) }
                .let { result -> println(result) }
        }
    }
}