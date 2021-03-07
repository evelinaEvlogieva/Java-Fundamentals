import java.util.*;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt)
//                .sorted(Comparator.reverseOrder())
//                .limit(3)
//                .forEach(integer -> System.out.print(integer + " "));

        System.out.println(Arrays.stream(scanner.nextLine().split(" "))
                .map(n -> Integer.parseInt(n))
                .sorted(Collections.reverseOrder())
                .limit(3)
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining( " ")));



    }
}
