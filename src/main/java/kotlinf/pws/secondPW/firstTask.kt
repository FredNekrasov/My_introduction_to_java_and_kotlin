package kotlinf.pws.secondPW

//Измените программу, сделанную в задании No1 практической работы No1: основной алгоритм вынесите в функцию. Опишите функцию как обычную функцию.
fun firstTaskV1(n: Int): Int {
    var number = n
    var value: Int
    var sum = 0
    while (number > 0) {
        value = number % 10
        if (value % 3 != 0) sum += value
        number /= 10
    }
    return sum
}
//Измените программу, сделанную в задании No1 практической работы No1: основной алгоритм вынесите в функцию. Опишите функцию как tailrec-функцию.
tailrec fun firstTaskV2(n: Int, sum: Int = 0): Int {
    if (n == 0) return sum
    val value = n % 10
    val newSum = if (value % 3 != 0) sum + value else sum
    return firstTaskV2(n / 10, newSum)
}
fun main() {
    println("enter a number")
    val n = readlnOrNull()?.toIntOrNull()
    if ((n == null) || (n <= 0)) println("Error")
    else {
        println(firstTaskV1(n))
        println(firstTaskV2(n))
    }
}