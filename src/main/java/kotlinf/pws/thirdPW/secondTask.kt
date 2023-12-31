package kotlinf.pws.thirdPW

//Реализуйте задания No2 первой практической работы с использованием функционального подхода в одно выражение каждое.
//В строке указано несколько слов, разделенных пробелами (по одному пробелу между словами). Какие символы присутствуют ровно в одном слове?
fun main() {
    readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string.split(" ")
        .flatMap { word -> word.toSet() }
        .groupBy { it }
        .filterValues { it.size == 1 }
        .keys
        .let { println(it) } else println("Error: String is empty") } ?: println("Error: String is null")
}
/*fun v1() = readlnOrNull()?.let { if (it.isNotEmpty()) it.groupingBy { i: Char -> i }.eachCount().let {j -> j.forEach{ k -> if (k.key == ' ') return@forEach else if (k.value == 1) println("\"${k.key}\" ${k.value}") } } else println("Error: String is empty") }
fun v2() = readlnOrNull()?.let {if (it.isNotEmpty()) println(it.filter { x -> it.count { y -> y == x } == 1 }) else println("Error: String is empty") }
fun v3() = println(readlnOrNull()?.let { if (it.isNotEmpty()) it.groupingBy { i: Char -> i }.eachCount().filterValues { j: Int -> j == 1 }.keys else "Error: String is empty" })*/