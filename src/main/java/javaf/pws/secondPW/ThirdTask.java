package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter a number");
            String number = scanner.nextLine();
            if (number.isEmpty() || number.isBlank()) System.out.println("Error: String is empty or blank");
            else {
                int n = Integer.parseInt(number);
                ISelection fun = (j) -> ((j % 10) % 3) != 0;
                System.out.println(forTaskV1(n, fun));
                System.out.println(forTaskV2(n, 0, fun));
            }
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        } catch (NumberFormatException ex){
            System.err.println("Error: This isn't a number");
        }
    }
    private static int forTaskV1(int n, ISelection condition){
        int sum = 0;
        int value;
        while (n > 0) {
            value = n % 10;
            if (condition.selection(n)) sum += value;
            n /= 10;
        }
        return sum;
    }
    private static int forTaskV2(int n, int sum, ISelection condition){
        if (n == 0) return sum;
        if (condition.selection(n)) sum += (n % 10);
        return forTaskV2(n / 10, sum, condition);
    }
    private interface ISelection { boolean selection(int n); }
}