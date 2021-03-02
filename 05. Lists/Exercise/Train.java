import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] command = input.split(" +");
            if (input.contains("Add")) {
                int people = Integer.parseInt(command[1]);
                train.add(people);
            } else {
                int people = Integer.parseInt(command[0]);
                for (int i = 0; i < train.size(); i++) {
                    int peopleInWagon = train.get(i);
                    int newPeopleCount = peopleInWagon + people;
                    if (newPeopleCount <= capacity){
                        train.set(i, newPeopleCount);
                        break;
                    }

                }

            }

            input = scanner.nextLine();
        }

        for (int nums : train) {
            System.out.print(nums + " ");
        }
    }
}
