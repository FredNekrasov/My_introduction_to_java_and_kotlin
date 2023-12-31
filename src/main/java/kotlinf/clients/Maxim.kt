package kotlinf.clients

class Maxim {
//Найдите второй символ в последнем максимально длинном слове с четным числом символов в строке (в строке указываются только слова, разделенные одним или несколькими пробелами).
    private fun secondPW4thTask(string: String, condition1: (Int, Int) -> Boolean, condition2: (Int) -> Boolean): Char{
        var symbol = ' '
        var length = 0
        var maxLength = 0
        for (i in string.indices){
            if ((string[i] == ' ')){
                if (condition2(length)) {
                    maxLength = length
                    symbol = string[i - (length - 1)]
                    break
                }
            } else length++
        }
        length = 0
        for (i in string.indices){
            if ((string[i] == ' ')){
                if (condition2(length) && condition1(length, maxLength)) {
                    maxLength = length
                    symbol = string[i - (length - 1)]
                }
                length = 0
            } else length++
        }
        if (condition1(length, maxLength) && condition2(length)) symbol = string[string.lastIndex - (length - 2)]
        return symbol
    }
    fun test() {
        val string = readlnOrNull()
        if (string != null) println(secondPW4thTask(string, { l: Int, maxL: Int -> l <= maxL }, { l: Int -> (l % 2) == 0 }))
        else println("Error")
    }
//В строке указано несколько целых чисел, разделенных пробелами. Какие цифры присутствуют в каждом числе дважды?
    fun thirdPW2ndTask() {
        readlnOrNull()?.let { string -> if (string.isNotEmpty() && string.isNotBlank()) string.split(" ").map { number -> number.filter { digit -> number.count { it == digit } == 2 }.toSet() }.reduce { acc, repeatedDigits -> acc intersect repeatedDigits }.let { println(it) } else println("Error: String is empty") } ?: println("Error: String is null")
    }
//По данному натуральному числу n найдите наибольший двойной факториал, меньший n
    fun thirdPW6thTask() {
        readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) generateSequence(1 to 1){ x -> (if (x.first == 1) { if ((it % 2) == 0) x.first + 2 else x.first + 1 } else x.first + 2) to x.second * x.first }.takeWhile { y -> y.second < it }.last().second.let { z -> println(z) } else println("Error") }
    }
//Проверка правильности последовательности операторов присваивания, правая часть которых – выражения, в которых используются литералы типа «множество» со значениями типа integer, переменные и операции +,-,*.
    fun regularExpression4th() {
        val rule = Regex("""(\s*([a-zA-Z_]\w*)\s*:=\s*([a-zA-Z_]\w*|\[((-?\d+\.\.-?\d+|-?\d+)(,\s*(-?\d+\.\.-?\d+|-?\d+))*)])(\s*([*+-])\s*([a-zA-Z_]\w*|\[((-?\d+\.\.-?\d+|-?\d+)(,\s*(-?\d+\.\.-?\d+|-?\d+))*)]))*\s*;)*""")
        val code = """
            d :=[2..2] + rdd + asd *[3,4]; d:= [2..2,2..2,2..2,2..2,2..2];
            d := [-1,-1, -1..-1] +d+ [-1,-1, -1..-1] +d;
            d:=[2..2,2..2,2..2,2..2,2..2,2] +d+ [2..2, 2];
            d:=[2..2] +asd* [3,4];
            d:=[2..2] +d* [3,4];
            d:=[222..12,22];
            d:=vb;
            d := [-1];
        """.trimIndent()
        val lines = code.split("\n")
        for (line in lines) {
            if (rule.matches(line.trim())) println("The |${line}| is correct") else println("The |${line}| is incorrect")
        }
        rule.findAll(lines[2].trim()).forEach { it.groups.forEach { x -> println(x?.value) } }    }
}