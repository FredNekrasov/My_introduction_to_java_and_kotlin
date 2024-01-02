package javaf.pws.seventhPW;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int n = 7;
        IOperation multiplication = a -> a * 9;
        IOperation division = a -> a / (a * 2);
        IOperation subtraction = a -> a - 5;
        IOperation[] operations = { subtraction, division, multiplication };
        System.out.println(findMinValue(n, operations));
    }
    private static int findMinValue(int a, IOperation[] operations){
        int index = 0;
        if (operations != null) {
            int minValue = operations[operations.length - 1].operation(a);
            int currentValue;
            index = operations.length - 1;
            for (int i = 0; i < (operations.length - 1); i++) {
                currentValue = operations[i].operation(a);
                if (minValue > currentValue) {
                    minValue = currentValue;
                    index = i;
                }
            }
        }
        return index;
    }
    interface IOperation { int operation(int a); }
}