package kotlinf.pws.firstPW

//Найдите последний символ в первом максимально длинном слове с четным числом символов в строке.
fun main(){
    val string = readlnOrNull()
    var maxLength = 0
    var symbol = ' '
    var length = 0
    if (string != null) {
        for (i in string.indices){
            if ((string[i] == ' ')){
                if ((length % 2) == 0 && (length > maxLength)) {
                    maxLength = length
                    symbol = string[i - 1]
                }
                length = 0
            } else length++
        }
        if ((length > maxLength) && (length % 2) == 0) symbol = string[string.lastIndex]
        println(symbol)
    } else println("Error")
}