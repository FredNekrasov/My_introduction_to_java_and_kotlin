package javaf.pws;

import java.util.Scanner;

public class FirstPW {
    private static final Scanner scanner = new Scanner(System.in);
//For a given non-negative integer, find the sum of digits that are not multiple of three. Check the correctness of the input.
    public static void firstTask(){
        System.out.println("enter a number");
        String number = scanner.next();
        if (number.isEmpty() || number.isBlank()) System.out.println("Error: String is empty or blank");
        else {
            try{
                int n = Integer.parseInt(number);
                int sum = 0;
                while (n > 0) {
                    if ((n % 10) % 3 != 0) sum += (n % 10);
                    n /= 10;
                }
                System.out.println(sum);
            } catch (NumberFormatException ex){
                System.err.println("Error: This isn't a number");
            }
        }
    }
//The line contains several words separated by spaces (one space between words). What characters are present in exactly one word?
    public static void secondTask() {
        System.out.println("Enter something");
        String string = scanner.nextLine();
        int[] countOfChars = new int[128];
        int[] uniqueChars = new int[128];
        if (!string.isEmpty() && !string.isBlank()) {
            for (int i = 0; i < string.length(); i++) {
                if ((int)string.charAt(i) > 128) {
                    System.out.printf("Error: The \"%s\" has a code greater than 128. %d", string.charAt(i), (int)string.charAt(i));
                    return;
                } else {
                    if (string.charAt(i) != ' '){
                        countOfChars[string.charAt(i)]++;
                        if (countOfChars[string.charAt(i)] == 1) uniqueChars[string.charAt(i)]++;
                    } else for (int j = 0; j < 128; j++) countOfChars[j] = 0;
                }
            }
            for (int i = 0; i < 128; i++) if (uniqueChars[i] == 1) System.out.printf("%c ", (char)i);
        } else System.out.println("Error: String is empty");
    }
//Find the last character in the first longest word with an even number of characters in the string.
    public static void thirdTask() {
        System.out.println("Enter something");
        String string = scanner.nextLine();
        int maxLength = 0;
        char symbol = ' ';
        int length = 0;
        if (!string.isBlank() || !string.isEmpty()) {
            for (int i = 0; i < string.length(); i++){
                if ((string.charAt(i) == ' ')){
                    if ((length % 2) == 0 && (length > maxLength)) {
                        maxLength = length;
                        symbol = string.charAt(i - 1);
                    }
                    length = 0;
                } else length++;
            }
            if ((length > maxLength) && (length % 2) == 0) symbol = string.charAt(string.length() - 1);
            System.out.println(symbol);
        } else System.out.println("Error");
    }

    public static void main(String[] args) {
        firstTask();
        System.out.println();
        secondTask();
        System.out.println();
        thirdTask();
    }
}