import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!"End".equals(input)) {
            String[] tokens = input.split(" +");
            String command = tokens[0];

            if ("Add".equals(command)) {
                int number = Integer.parseInt(tokens[1]);
                numbers.add(number);
            } else if ("Insert".equals(command)) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }
            } else if ("Remove".equals(command)) {
                int index = Integer.parseInt(tokens[1]);
                if (index < 0 || index >= numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }
            } else if ("Shift".equals(command)){
                String direction = tokens[1];
                int count = Integer.parseInt(tokens[2]);
                if ("left".equals(direction)){
                 //Shift left {count} - first number becomes last 'count' times
                    for (int i = 0; i < count; i++) {
                    int duplicate = numbers.get(0);
                    numbers.add(duplicate);
                    numbers.remove(0);
                    }
                } else if ("right".equals(direction)){
                    //Shift right {count} - last number becomes first 'count' times
                    for (int i = 0; i < count; i++) {
                        int duplicate = numbers.get((numbers.size() - 1));
                        numbers.add(0, duplicate);
                        numbers.remove((numbers.size() - 1));
                    }
                }
            }


            input = scanner.nextLine();

        }

        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
    }
}
