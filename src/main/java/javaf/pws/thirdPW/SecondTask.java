package javaf.pws.thirdPW;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondTask {
//The line contains several words separated by spaces (one space between words). What characters are present in exactly one word?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inf = scanner.nextLine();
        System.out.println(Arrays.stream(inf.split(" ")).flatMap(word -> Arrays.stream(word.split(""))).collect(Collectors.toSet()).stream().filter(c -> Arrays.stream(inf.split(" ")).filter(word -> word.contains(c)).count() == 1).collect(Collectors.toSet()));
    }
}
