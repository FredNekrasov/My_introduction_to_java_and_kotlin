package javaf.pws;

import java.util.regex.Pattern;

public class FourthPW {
    public static void testPascalSyntaxV1(){
        Pattern rule = Pattern.compile("(^([a-zA-Z_]+[0-9]*)*)\\s*:=\\s*('[^'\"]'|#\\d+|(\\[(('[^'\"]'|#\\d+),?\\s)*('[^'\"]'|#\\d+)]|\\[(('[^'\"]'|#\\d+)..('[^'\"]'|#\\d+),?\\s*)*])|([a-zA-Z_]+[0-9]*)*)\\s*(([-+*])\\s*('[^'\"]'|#\\d+|(\\[(('[^'\"]'|#\\d+),?\\s)*('[^'\"]'|#\\d+)]|\\[(('[^'\"]'|#\\d+)..('[^'\"]'|#\\d+),?\\s*)*])|([a-zA-Z_]+[0-9]*)*)*\\s*)*;");
        String code = """
        chs1 := ['a'..'d', 'b', 'd'];
        chs2 := ['m', 'd', 'e'];
        chs3 := chs1 + chs2 + ['k', 'n'];
        var1 := 'A' + 'B' + 'C';
        var2 := ['a'..'z'] + ['A'..'Z', '0'..'9'] - '9';
        var3 := var2 - var1;
        var4 := var1 - 'B';
        var5 := ['O'..'9'] * ['a'..'z'];""";
        var lines = code.split("\n");
        for (String line: lines) {
            if (rule.matcher(line).matches()) System.out.println("The |" + line + "| is correct");
            else System.out.println("The |" + line + "| is incorrect");
        }
    }
    public static void testPascalSyntaxV2(){
        Pattern rule = Pattern.compile("(\\s*([a-zA-Z_]\\w*)\\s*:=\\s*([a-zA-Z_]\\w*|\\[((('[^']'|#\\d+|'''')\\.\\.('[^']'|#\\d+|'''')|('[^']'|#\\d+|''''))(,\\s*(('[^'\"]'|#\\d+|'''')\\.\\.('[^'\"]'|#\\d+|'''')|('[^']'|#\\d+|'''')))*)])(\\s*([*+-])\\s*([a-zA-Z_]\\w*|\\[((('[^']'|#\\d+|'''')\\.\\.('[^']'|#\\d+|'''')|('[^']'|#\\d+|''''))(,\\s*(('[^']'|#\\d+|'''')\\.\\.('[^']'|#\\d+|'''')|('[^']'|#\\d+|'''')))*)]))*\\s*;)*");
        String code = """
        a1a2 := [' ', 'd', 'e'] + [' ', 'd', 'e']; _1 := ['''', ' ', 'e', #56] - ['''', #67, #89..#97, #45];
        is_me := chs2_djs23 + ['k', 'n'];
        var4 := var1 - ['0'..'9'];
        var2 := [#32..'z', #45..#78] + ['A'..'Z', '0'..'9'] - ['d', #32];
        var3 := var2sfd34 + var1 * [''''];
        var5 := ['O'..'9'] * ['a'..'z', 'A', 'Z'];""";
        var lines = code.split("\n");
        for (String line: lines) {
            if (rule.matcher(line).matches()) System.out.println("The |" + line + "| is correct");
            else System.out.println("The |" + line + "| is incorrect");
        }
    }

    public static void main(String[] args) {
        testPascalSyntaxV1();
        System.out.println();
        testPascalSyntaxV2();
    }
}