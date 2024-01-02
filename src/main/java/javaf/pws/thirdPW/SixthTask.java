package javaf.pws.thirdPW;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inf = scanner.nextInt();
        System.out.println(IntStream.rangeClosed(2, inf).filter(i -> i % 2 == inf % 2).reduce(1, (a, b) -> a * b));
    }
}