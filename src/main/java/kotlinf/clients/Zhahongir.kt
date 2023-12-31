package kotlinf.clients

class Zhahongir {
//Имеется некоторая последовательность цифр от 0 до 9. С клавиатуры вводится 9 строк следующего вида: цифра->цифра
//Каждая строка обозначает, что после цифры, стоящей до стрелки, в последовательности стоит цифра, стоящая после стрелки.
//Выведите исходную последовательность.
    fun firstPW2ndTask() {
        val inf: String? = "0->3\n1->4\n2->1\n3->9\n4->0\n5->2\n6->5\n8->7\n9->8"
        if (!inf.isNullOrEmpty() && inf.isNotBlank()){
            val countOfChars1 = Array(inf.length) { ' ' }
            val countOfChars2 = Array(inf.length) { ' ' }
            var char = ' '
            for (i in inf.indices step 5) {
                countOfChars1[i] = inf[i]
                countOfChars2[i] = inf[i + 3]
            }
            println(countOfChars1.contentToString())
            println(countOfChars2.contentToString())
            for (i in inf.indices){
                if (countOfChars1[i] !in countOfChars2) char = countOfChars1[i]
            }
            var i = 0
            while (i < inf.length){
                if (countOfChars1[i] == char) {
                    print(char)
                    char = countOfChars2[i]
                    i = -1
                }
                i++
            }
            for (j in inf.indices){
                if (countOfChars2[j] !in countOfChars1) println(countOfChars2[j])
            }
        } else println("Error: The string is empty")
    }
//Найдите предпоследний символ в первом максимально длинном слове с четным числом символов в строке (в строке указываются только слова, разделенные одним или несколькими пробелами).
    private fun secondPW4thTask(string: String, condition1: (Int, Int) -> Boolean, condition2: (Int) -> Boolean): Char {
        var symbol = ' '
        var length = 0
        var maxLength = 0
        for (i in string.indices){
            if ((string[i] == ' ')){
                if (condition2(length)) {
                    maxLength = length
                    symbol = string[i - 2]
                    break
                }
            } else length++
        }
        length = 0
        for (i in string.indices){
            if ((string[i] == ' ')){
                if (condition2(length) && condition1(length, maxLength)) {
                    maxLength = length
                    symbol = string[i - 2]
                }
                length = 0
            } else length++
        }
        if (condition1(length, maxLength) && condition2(length)) symbol = string[string.lastIndex - 1]
        return symbol
    }
    fun test() {
        val string = readlnOrNull()
        if (string != null) println(secondPW4thTask(string, { l: Int, maxL: Int -> l <= maxL }, { l: Int -> (l % 2) == 0 }))
        else println("Error")
    }
}