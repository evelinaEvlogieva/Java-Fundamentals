import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .filter(s -> s.length() % 2 == 0)
                .forEach(e -> System.out.println(e));

//
//        String[] input = Arrays.stream(scanner.nextLine().split(" "))
//                .filter(s -> s.length() % 2 == 0)
//                .toArray(String[] :: new);
//
//        for (String s : input) {
//            System.out.println(s);
//        }

    }
}
