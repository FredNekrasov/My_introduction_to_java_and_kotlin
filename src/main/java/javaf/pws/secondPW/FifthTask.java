package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FifthTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        try{
            System.out.println("Enter something");
            String string = scanner.nextLine();
            if (!string.isEmpty()){
                forTask(string);
            } else System.out.println("Error: The string is empty or blank");
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        }
    }
    private static void forTask(String inf){
        int[] countOfChars = new int[128];
        int[] uniqueSymbols = new int[128];
        for (int i = 0; i < inf.length(); i++) {
            if ((int)inf.charAt(i) > 128) {
                System.out.printf("Error: The \"%s\" has a code greater than 128. %d", inf.charAt(i), (int)inf.charAt(i));
                return;
            } else {
                if (inf.charAt(i) != ' '){
                    countOfChars[inf.charAt(i)]++;
                    if (countOfChars[inf.charAt(i)] == 1) uniqueSymbols[inf.charAt(i)]++;
                } else for (int j = 0; j < 128; j++) countOfChars[j] = 0;
            }
        }
        for (int i = 0; i < 128; i++) if (uniqueSymbols[i] == 1) System.out.printf("%c ", (char)i);
    }
}