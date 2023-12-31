package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FirstTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("enter a number");
            String number = scanner.nextLine();
            if (number.isEmpty() || number.isBlank()) System.out.println("Error: String is empty or blank");
            else {
                int n = Integer.parseInt(number);
                System.out.println(forTaskV1(n));
                System.out.println(forTaskV2(n, 0));
            }
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        } catch (NumberFormatException ex){
            System.err.println("Error: This isn't a number");
        }
    }
    private static int forTaskV1(int n){
        int sum = 0;
        int value;
        while (n > 0) {
            value = n % 10;
            if ((value % 3) != 0) sum += value;
            n /= 10;
        }
        return sum;
    }
    private static int forTaskV2(int n, int sum){
        if (n == 0) return sum;
        if (((n % 10) % 3) != 0) sum += (n % 10);
        return forTaskV2(n / 10, sum);
    }
}