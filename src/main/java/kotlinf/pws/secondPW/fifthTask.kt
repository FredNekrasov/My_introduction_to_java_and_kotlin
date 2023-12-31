package kotlinf.pws.secondPW

//Создайте функцию, которая реализует алгоритм второго задания первой практической работы, в которую все числа, слова или пары (в зависимости от варианта) передаются в аргументах функции. Например: f(123,25,222).
fun fifthNumberWithString(vararg inf: String){
    var source = ""
    val countOfChars = Array(128) { 0 }
    val countOfUniqueChars = Array(128) { 0 }
    if (inf.isNotEmpty()){
        repeat(inf.size) { source += "${inf[it]} " }
        for (i in source) {
            if (i.code > 127) return println("Error: The \"$i\" has a code greater than 127. ${i.code}")
            if (i != ' '){
                countOfChars[i.code]++
                if (countOfChars[i.code] == 1) {
                    countOfUniqueChars[i.code]++
                }
            } else countOfChars.fill(0)
        }
        for (i in 0..<127) if (countOfUniqueChars[i] == 1) print(i.toChar())
    } else println("Error: The strings are empty")
}
fun main() {
    fifthNumberWithString("dfg", "reader", Pair(2,33).toString())
    /*println()
    fifthNumberWithStringV2("dfd", "ddd", Pair(2,3).toString())
    println()
    fifthNumberWithInt(1, 2, 3, 4, 5, 6, 2, 3)
    println()
    fifthNumberWithPair(Pair(3,5),Pair(4,1), Pair(3,1))*/
}
/*fun fifthNumberWithStringV2(vararg inf: String?){
    val uniqueSymbols = Array(127) {0}
    if (inf.isNotEmpty()){
        for (i in inf){
            if (i != null) {
                for (j in i) if (j.code > 127) return println("Error: The \"$i\" has a code greater than 127. ${j.code}") else if (j == ' ') continue else uniqueSymbols[j.code]++
                for (k in i) if (uniqueSymbols[k.code] == 1) print("$k")
            } else continue
        }
    } else println("Error: The strings are empty")
}
fun fifthNumberWithInt(vararg inf: Int?){
    val uniqueSymbols = Array(127) {0}
    if (inf.isNotEmpty()){
        for (i in inf) if (i == null) continue else uniqueSymbols[i.toChar().code]++
        for (j in inf) if (j == null) continue else if (uniqueSymbols[j.toChar().code] == 1) print("$j ")
    } else println("Error: The parameter array is empty")
}
fun fifthNumberWithPair(vararg inf: Pair<Int, Int>?){
    var source = ""
    repeat(inf.size){ source += inf[it]?.first.toString() + "${ inf[it]?.second.toString() } " }
    val uniqueSymbols = Array(127) {0}
    if (source.isNotEmpty()){
        for (i in source) if (i.code > 127) return println("Error: The \"$i\" has a code greater than 127. ${i.code}") else if (i == ' ') continue else uniqueSymbols[i.code]++
        for (k in source) if (uniqueSymbols[k.code] == 1) print("$k ")
    } else println("Error: Pairs are empty")
}*/