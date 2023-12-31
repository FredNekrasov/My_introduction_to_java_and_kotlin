package kotlinf.clients.ivanova

class ThirdPW {
//Для данного неотрицательного целого числа найдите сумму нечетных цифр. Осуществите проверку корректности ввода.
    fun task1() {
        readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) it.toString().map{ x -> x.digitToInt() }.filter { y -> y % 2 != 0 }.sum().let { z -> println(z) } else println("Error") }
    }
//В строке указано несколько неотрицательных целых чисел, разделенных пробелами. Какие цифры присутствуют в каждом числе?
    fun task2() {
        readlnOrNull()?.let { value -> if (value.isNotEmpty() && value.isNotBlank()) value.split(" ").map { if (it.contains(Regex("""\D"""))) return else it }.flatMap { word -> word.toSet() }.groupBy { it }.filterValues { it.size == value.split(" ").count() }.keys.let { println(it) } else println("Error2") } ?: println("Error1")
    }
//Найдите последний символ в первом максимально длинном слове с нечетным числом символов в строке с использованием функционального подхода в одно выражение каждое (без учета ввода-вывода).
    fun task3() {
        readlnOrNull().let { if (!it.isNullOrBlank() && it.isNotEmpty()) it.split(" ").filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.lastOrNull().let { z -> println(z) } else println("Error") }
    }
//С клавиатуры вводится несколько целых значений через пробел. Найдите (без учета тех чисел, где соответствующей цифры нет): Побитовое ИЛИ предпоследней цифры всех чисел
    fun task4() {
        readlnOrNull().let { string -> if (string.isNullOrBlank() || string.isEmpty()) println("Error1") else string.split(" ").map { strings -> if (strings.contains(Regex("""\D"""))) { println("Error2"); return } else if (strings.length > 1) strings[strings.length - 2] else strings.single()}.map { number -> number.digitToInt() }.reduceRight { i, acc -> acc.or(i) }.let { result -> println(result) } }
    }
//С клавиатуры вводится информация о студентах: фамилия, имя, оценки. Выведите на экран информацию о трех лучших студентах по максимальному баллу.
//В случае, если у нескольких студентов средний балл совпадает, то выведите большее число студентов
//(пока не будут выведены все студенты или не будут полностью исчерпаны студенты с тремя лучшими баллами).
//Вывод надо осуществлять в порядке убывания максимального балла, а для одинаковых максимальных баллов – в алфавитном порядке по фамилии и имени.
    fun task5() {
        val s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 5
            james williams 3 3 5
        """.trimIndent()
        val thirdPlace = s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d }.take(3).minBy { e -> e } } else 0 }
        s.let { if (it.isNotEmpty() && it.isNotBlank()) { it.trim().lines().asSequence().map { a -> a.split(" ") }.map { b -> (b[0] + " " + b[1]) to b.slice(2..<b.size).maxOf { c -> c.toInt() } }.sortedByDescending { d -> d.second }.groupBy { e -> e.second }.forEach { (_, students) -> students.sortedBy { g -> g.first }.forEach { (name, mark) -> if (mark >= thirdPlace) println("$name $mark") } } } else println("Error: String is empty or blank") }
    }
//По числу Фибоначчи найдите его номер (не используйте факты, которые вы не можете доказать самостоятельно)
    fun task6() {
        readlnOrNull()?.toIntOrNull().let { value -> if ((value != null) && (value >= 0)) generateSequence(0 to 1) { it.second to it.first + it.second }.map { it.first }.take(value + 1).last().let { println(it) } else println("Error") }
        readlnOrNull()?.toIntOrNull().let { value -> if ((value != null) && (value >= 0)) generateSequence(0 to 1) { it.second to it.first + it.second }.indexOfFirst { it.second == value }.let { println(it + 1) } else println("Error") }
    }
}