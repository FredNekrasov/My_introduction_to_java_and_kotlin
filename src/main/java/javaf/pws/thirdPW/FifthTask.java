package javaf.pws.thirdPW;

import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) {
        String s = """
            alex smith 5 5 5
            fred nekrasov 5 5 5
            emma brown 4 4 5
            john brown 2 2 5
            james williams 3 3 5
        """.trim();
        int thirdPlace = Arrays.stream(s.split("\n")).map(line -> line.split(" ")).mapToInt(arr -> Arrays.stream(arr).skip(2).mapToInt(Integer::parseInt).max().orElse(0)).sorted().distinct().skip(2).findFirst().orElse(0);
        Arrays.stream(s.split("\n")).map(line -> line.split(" "));
    }
}
