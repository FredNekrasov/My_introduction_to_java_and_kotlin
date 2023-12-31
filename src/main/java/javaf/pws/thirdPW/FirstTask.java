package javaf.pws.thirdPW;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    private static final Scanner scanner = new Scanner(System.in);
//For a given non-negative integer, find the sum of digits that are not multiples of three, using a functional approach.
    public static void main(String[] args) {
        String inf = scanner.next();
        System.out.println(Arrays.stream(inf.split("")).mapToInt(Integer::parseInt).filter(x -> x % 3 != 0).sum());
    }
}