import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split(" +");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);

            if ("Delete".equals(command)) {
                for (int i = 0; i < numbers.size(); i++) {
                    numbers.remove(Integer.valueOf(element));
                }

            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                }
            }


            input = scanner.nextLine();
        }

        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
    }
}
