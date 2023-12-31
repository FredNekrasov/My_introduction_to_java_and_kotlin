package javaf.pws.thirdPW;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    private static final Scanner scanner = new Scanner(System.in);
//Find the last character in the first longest word with an even number of characters in the string.
    public static void main(String[] args) {
        String line = scanner.nextLine();
        System.out.println(Arrays.stream(line.split(" ")).filter(word -> word.length() % 2 == 0).sorted((w1, w2) -> Integer.compare(w2.length(), w1.length())).findFirst().map(w -> w.charAt(w.length() - 1)).orElse(' '));
    }
}
