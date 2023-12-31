package kotlinf.pws.thirdPW

//По натуральному числу найдите его двойной факториал
fun main() {
    readlnOrNull()?.toIntOrNull().let { if ((it != null) && (it > 0)) generateSequence(1 to it){ x -> (if (x.first == 1) { if ((it % 2) == 0) x.first + 1 else x.first + 2 } else x.first + 2) to x.second * x.first }.filter { y -> y.first == it }.first().second.let { z -> println(z) } else println("Error") }
}