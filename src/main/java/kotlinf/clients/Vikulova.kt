package kotlinf.clients

class Vikulova {
//Программа проверки правильности оператора присваивания, в правой части которого допустимы операции +, -, *, /, переменные, целые и вещественные числа.
    fun regularExpression4th() {
        val rule = Regex("""(\s*([a-zA-Z_]\w*)\s*:=\s*([a-zA-Z_]\w*|\d*|\d*\.\d*)(\s*([/*+-])\s*([a-zA-Z_]\w*|\d*|\d*\.\d*))*;)*""")
        val pascalSyntax = """
            ab:= a + b + c + 4 + 8 - 5 * 2 / 1; ab := a + b + c + 4 / 2 + 8 - 5 * 2;
            ab:= 1 + b + c + 4+ 8-5*2/1;
            ab:= 1.0 + b + c + 4+ 8-5*2/1;
            ab:= 2.0 + b + c + 4+ 8-5*2/1;
            ab:= 3 + b + 4.3 + 4+ 8-5*2;
            ab:= 4.9 + b + c + 4+ 8/2-5*2;
            ab:= 5.6 + 4.6 + 7.5 + 4+ 8-5*2/1;
        """.trimIndent()
        val lines = pascalSyntax.trim().split("\n")
        for (line in lines){
            if (rule.matches(line)) println("$line is correct") else println("$line is incorrect")
        }
    }
}