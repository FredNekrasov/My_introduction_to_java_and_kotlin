package kotlinf.pws.firstPW

//В строке указано несколько слов, разделенных пробелами (по одному пробелу между словами). Какие символы присутствуют ровно в одном слове? Предполагается, что все символы в строке имеют код, не больший, чем 127.
fun main() {
    val inf = readlnOrNull()
    val countOfChars = Array(128) { 0 }
    val countOfUniqueChars = Array(128) { 0 }
    if (!inf.isNullOrEmpty() && inf.isNotBlank()){
        for (i in inf) {
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