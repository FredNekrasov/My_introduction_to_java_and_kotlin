package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter something");
            String string = scanner.nextLine();
            ISelection selection = (l) -> ((l % 2) == 0);
            IMaxOrMin condition = (l, m) -> l > m;
            if (!string.isEmpty() || !string.isBlank()) System.out.println((forTask(string, condition, selection)));
            else System.out.println("Error: The string is empty or blank");
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        }
    }
    private static char forTask(String string, IMaxOrMin condition, ISelection select){
        char symbol = ' ';
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < string.length(); i++){
            if ((string.charAt(i) == ' ')){
                if (select.selection(length)) {
                    maxLength = length;
                    symbol = string.charAt(i - 1);
                    length = 0;
                    break;
                }
            } else length++;
        }
        for (int i = 0; i < string.length(); i++){
            if ((string.charAt(i) == ' ')){
                if (select.selection(length) && condition.selectionMaxOrMin(length, maxLength)) {
                    maxLength = length;
                    symbol = string.charAt(i - 1);
                }
                length = 0;
            } else length++;
        }
        if (condition.selectionMaxOrMin(length, maxLength) && select.selection(length)) symbol = string.charAt(string.length() - 1);
        return symbol;
    }
    private interface ISelection { boolean selection(int n); }
    interface IMaxOrMin { boolean selectionMaxOrMin(int l, int m); }
}