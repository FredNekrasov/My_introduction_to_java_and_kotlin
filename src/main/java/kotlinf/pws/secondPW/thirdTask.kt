package kotlinf.pws.secondPW

/*Функции, созданные в задании No1, модифицируйте таким образом, чтобы условие, по которому происходит отбор, можно было передавать как аргумент
(один из аргументов функции должен быть lambda со значением по умолчанию – условием, что указано было в вашем варианте).*/
fun thirdTaskV1(n: Int, condition: (Int) -> Boolean = {(it % 3) != 0}): Int {
    var number = n
    var value: Int
    var sum = 0
    while (number > 0) {
        value = number % 10
        if (condition(value)) sum += value
        number /= 10
    }
    return sum
}
tailrec fun thirdTaskV2(n: Int, sum: Int = 0, condition: (Int) -> Boolean = {(it % 3) != 0}): Int {
    if (n == 0) return sum
    val value = n % 10
    val newSum = if (condition(value)) sum + value else sum
    return thirdTaskV2(n / 10, newSum)
}
fun main() {
    println("enter a number")
    val n = readlnOrNull()?.toIntOrNull()
    if ((n == null) || (n <= 0)) println("Error")
    else {
        println(thirdTaskV1(n))
        println(thirdTaskV2(n))
    }
}