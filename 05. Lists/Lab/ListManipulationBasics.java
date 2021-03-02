import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            if ("Add".equals(command)) {
                numbers.add(Integer.parseInt(tokens[1]));
            } else if ("Remove".equals(command)) {
                numbers.remove(Integer.valueOf(Integer.parseInt(tokens[1])));
            } else if ("RemoveAt".equals(command)) {
                numbers.remove(Integer.parseInt(tokens[1]));
            } else if ("Insert".equals(command)) {
                numbers.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
            }

            input = scanner.nextLine();
        }

        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
    }
}
