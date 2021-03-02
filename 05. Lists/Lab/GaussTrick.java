import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        int sum = 0;

        if (numbers.size() % 2 != 0) {
            for (int i = 0; i < numbers.size() / 2; i++) {

                sum = numbers.get(i) + numbers.get(numbers.size() - 1);
                numbers.set(i, sum);
                numbers.remove(numbers.size() - 1);

            }
            for (int nums : numbers) {
                System.out.print(nums + " ");
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {

                sum = numbers.get(i) + numbers.get(numbers.size() - 1);
                numbers.set(i, sum);
                numbers.remove(numbers.size() - 1);

            }

            for (int nums : numbers) {
                System.out.print(nums + " ");
            }


        }


    }
}
