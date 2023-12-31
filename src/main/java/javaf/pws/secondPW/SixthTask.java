package javaf.pws.secondPW;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SixthTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("enter a number");
            String number1 = scanner.next();
            String number2 = scanner.next();
            if (number1.isEmpty() || number1.isBlank() || number2.isEmpty() || number2.isBlank()) System.out.println("Error: String is empty or blank");
            else {
                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                IOperation multiplication = (a, b) -> a * b;
                IOperation division = (a, b) -> a / b;
                IOperation subtraction = (a, b) -> a - b;
                IOperation[] operations = { subtraction, division, multiplication };
                System.out.println(findMinValue(n1, n2, operations));
            }
        } catch (NoSuchElementException ex){
            System.err.println("Error: String is null");
        } catch (NumberFormatException ex){
            System.err.println("Error: This isn't a number");
        }
    }
    private static int findMinValue(int a, int b, IOperation[] operations){
        int index = 0;
        if (operations != null) {
            int minValue = operations[operations.length - 1].operation(a, b);
            int currentValue;
            index = operations.length - 1;
            for (int i = 0; i < (operations.length - 1); i++) {
                currentValue = operations[i].operation(a, b);
                if (minValue > currentValue) {
                    minValue = currentValue;
                    index = i;
                }
            }
        }
        return index;
    }
    interface IOperation { int operation(int a, int b); }
}