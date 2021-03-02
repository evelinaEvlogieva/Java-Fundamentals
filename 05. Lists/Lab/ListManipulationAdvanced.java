import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            if ("Contains".equals(command)) {
                if (numbers.contains(Integer.parseInt(tokens[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if ("Print".equals(command)) {
                String evenOrOdd = tokens[1];
                if ("even".equals(evenOrOdd)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if ("odd".equals(evenOrOdd)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            } else if ("Get".equals(command)) {
                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum += numbers.get(i);

                }
                System.out.println(sum);

            } else if ("Filter".equals(command)) {
                String condition = tokens[1];
                int number = Integer.parseInt(tokens[2]);
                if (">".equals(condition)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) > number) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (">=".equals(condition)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) >= number) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if ("<".equals(condition)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < number) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if ("<=".equals(condition)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) <= number) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }

            input = scanner.nextLine();
        }


    }
}

