package kotlinf.clients.ivanova

class FourthPW {
//Проверка правильности оператора while, у которого условие имеет вид: <переменная><знак><строка>, при этом знак – это знак >, <, >=, <=, =, <>; строка – литерал типа string.
//Телом цикла является либо снова оператор while, либо оператор writeln, аргументами которого являются выражения, содержащие целые числа, имена переменных и операции +, -, *, /.
    fun regularExpression4th() {
        val rule = Regex("""""", option = RegexOption.MULTILINE)
        val pascalSyntax = """
            while sum < '100' do begin
                writeln('Сумма: ', sum + 2 * 2 / 2);
            end;
        """.trimIndent()
        val pascalSyntax1 = """
            while sum < '100' do begin
                while sum < '100' do begin
                    writeln('Сумма: ', sum + 2 * 2/2);
                end;
            end;
        """.trimIndent()
        if (rule.matches(pascalSyntax)) println("the code is correct")
        else println("the code is incorrect")
        if (rule.matches(pascalSyntax1)) println("the code is correct")
        else println("the code is incorrect")
    }
}