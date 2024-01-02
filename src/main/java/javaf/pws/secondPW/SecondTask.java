package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter a number");
            String number = scanner.nextLine();
            if (number.isEmpty() || number.isBlank()) System.out.println("Error: String is empty or blank");
            else {
                int n = Integer.parseInt(number);
                int sum = 0;
                while (n > 0) {
                    if (forTask(n)) sum += (n % 10);
                    n /= 10;
                }
                System.out.println(sum);
            }
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        } catch (NumberFormatException ex){
            System.err.println("Error: This isn't a number");
        }
    }
    private static boolean forTask(int n){ return ((n % 10) % 3) != 0;}
}