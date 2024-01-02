package javaf.pws.thirdPW;

import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).reduce((acc, i) -> Integer.reverse(acc) & Integer.reverse(i)).orElse(Integer.MAX_VALUE));
    }
}
