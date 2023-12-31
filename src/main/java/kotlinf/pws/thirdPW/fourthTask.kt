package kotlinf.pws.thirdPW

//С клавиатуры вводится несколько целых значений через пробел. Найдите побитовую стрелку Пирса последней цифры всех чисел (операции выполняются справа налево)
fun main() {
    readlnOrNull().let { string -> if (string.isNullOrBlank()) println("Error: String is empty or blank") else string.split(" ").map { strings -> if (strings.contains(Regex("""\D"""))) return else strings.last() }.map { number -> number.digitToInt() }.reduceRight { i, acc -> acc.inv().and(i.inv()) }.let { result -> println(result) } }
}