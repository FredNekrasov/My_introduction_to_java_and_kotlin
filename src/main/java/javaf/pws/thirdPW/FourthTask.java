package javaf.pws.thirdPW;

import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input = scanner.nextLine();
        System.out.println(Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).reduce((acc, i) -> Integer.reverse(acc) & Integer.reverse(i)).orElse(Integer.MAX_VALUE));
    }
}
