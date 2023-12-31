package kotlinf.pws.secondPW

//В программе, сделанной в задании No1, вынесите проверяемое условие в отдельную single-expression функцию.
fun secondTask(it: Int) = (it % 3) != 0
fun secondTaskV1(n: Int): Int {
    var number = n
    var value: Int
    var sum = 0
    while (number > 0) {
        value = number % 10
        if (secondTask(value)) sum += value
        number /= 10
    }
    return sum
}
tailrec fun secondTaskV2(n: Int, sum: Int = 0): Int {
    if (n == 0) return sum
    val value = n % 10
    val newSum = if (secondTask(value)) sum + value else sum
    return secondTaskV2(n / 10, newSum)
}
fun main() {
    println("enter a number")
    val n = readlnOrNull()?.toIntOrNull()
    if ((n == null) || (n <= 0)) println("Error")
    else {
        println(secondTaskV1(n))
        println(secondTaskV2(n))
    }
}