package kotlinf.pws.firstPW

//Для данного неотрицательного целого числа найдите сумму цифр, некратных трем. Осуществите проверку корректности ввода.
fun main(){
    println("enter a number")
    var n = readlnOrNull()?.toIntOrNull()
    var value: Int
    var sum = 0
    if ((n == null) || (n <= 0)) println("Error")
    else {
        while (n > 0) {
            value = n % 10
            if (value % 3 != 0) sum += value
            n /= 10
        }
        println(sum)
    }
}