package kotlinf.pws.secondPW

/*В задании No3 первой практической работы реализуйте следующее: выделите основной алгоритм в отдельную функцию, куда в качестве аргумента передавайте lambda, имеющую смысл – способ сравнения двух чисел;
изменяя данную lambda, пользователь вашей функции должен иметь возможность получить информацию либо о самых длинных, либо о самых коротких словах.
Аналогичным образом передавайте в вашу функцию lambda, которая будет определять условие отбора слов.*/
fun fourthTask(string: String, condition1: (Int, Int) -> Boolean, condition2: (Int) -> Boolean): Char{
    var symbol = ' '
    var length = 0
    var maxLength = 0
    for (i in string.indices){
        if ((string[i] == ' ')){
            if (condition2(length)) {
                maxLength = length
                symbol = string[i - 1]
                break
            }
        } else length++
    }
    length = 0
    for (i in string.indices){
        if ((string[i] == ' ')){
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
fun main() {
    val string = readlnOrNull()
    if (string != null) println(fourthTask(string, { l: Int, maxL: Int -> l > maxL }, { l: Int -> (l % 2) == 0}))
    else println("Error")
}