package kotlinf.clients

class Valentin {
//Найдите последний символ в последнем максимально длинном слове с нечетным числом симвлов в строке (в строке указываются только слова, разделенные одним или несколькими пробелами).
    private fun secondPW4thTask(string: String, condition1: (Int, Int) -> Boolean, condition2: (Int) -> Boolean): Char{
        var symbol = ' '
        var length = 0
        var maxLength = 0
        for (i in string.indices){
            if ((string[i] == ' ') || (i == string.lastIndex)){
                if (condition2(length)) {
                    maxLength = length
                    symbol = string[i - 1]
                    break
                }
            } else length++
        }
        length = 0
        for (i in string.indices){
            if (string[i] == ' '){
                if (condition2(length) && condition1(length, maxLength)) {
                    maxLength = length
                    symbol = string[i - 1]
                }
                length = 0
            } else length++
        }
        if (condition1(length, maxLength) && condition2(length)) symbol = string[string.lastIndex]
        return symbol
    }
    fun test() {
        val string = readlnOrNull()
        if (string != null) println(secondPW4thTask(string, { l: Int, maxL: Int -> l <= maxL }, { l: Int -> (l % 2) == 0 }))
        else println("Error")
    }
//Найдите последний символ в первом максимально длинном слове с четным числом символов в строке.
    fun thirdPW3thTask() {
        readlnOrNull()?.let { if (it.isNotEmpty() || it.isNotBlank()) { it.split(" ").reversed().filter { y -> y.count() % 2 != 0 }.maxByOrNull { y -> y.length }?.lastOrNull().let { z -> println(z) } } else println("Error: String is empty") }
    }
//По факториалу найдите исходное число
    fun thirdPW6thTask() {
        readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) generateSequence(1 to 1) { x -> x.first + 1 to x.second * x.first }.filter { y -> y.second >= it }.first().let { numbers -> if (numbers.second == it) println(numbers.first - 1) else println("Error: Entered number is not a factorial") } else println("Error") }
    }
//Программа проверки правильности описания массива, у которого индексы могут иметь тип-название (например, boolean), перечислимый тип, а тип-элемента – ограниченный тип для integer.
    fun regularExpression4th() {
        val rule = Regex("""\s*(Var|var)?\s*([a-zA-Z_]\w*)\s*:\s*(Array|array)\s*\[\s*((\d+|'\w'|\w+)\s*\.\.\s*(\d+|'\w'|\w+)|\d+(\s*,\s*\d+)*|integer|word|byte|shortint|boolean|char|\([a-zA-Z_]\w*(,\s*[a-zA-Z_]\w*)*\)\s*(,\s*\([a-zA-Z_]\w*(,\s*[a-zA-Z_]\w*)*\))*)\s*]\s*(of|Of)\s*(integer|-?\d+..-?\d+)\s*;""")
        val code = """
            var ch: array [1..11] of integer;
            ch: array [1, 1, 1, 11, 1,2,3,5,6] of integer;
            var ch: array [1..11] of integer;
            m1:array [1..100] of integer;
            m1:array [boolean] of integer;
            m1:array [char] of integer;
            varch: array [1..11] of integer;
            ch: array [1, 1, 1, 11, 1,2,3,5,6] of integer;
            var ch: array [1..11] of -50..50;
            m1:array [1..100] of integer;
            m1:array [boolean] of integer;
            m1:array [(red2,yellow,green)] of -50..50; 
            m1:array [(red2,yellow,green),(a,b,c)] of -50..50;
        """.trimIndent()
        val lines = code.trim().lines()
        for (line in lines) {
            if (rule.matches(line.trim())) println("The |${line}| is correct") else println("The |${line}| is incorrect")
        }
    }
}