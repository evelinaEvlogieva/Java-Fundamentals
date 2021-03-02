import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputOfNumbers = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] numberAndPower = Arrays.stream(scanner.nextLine().split(" +"))
                .mapToInt(Integer::parseInt).toArray();

        int bombNumber = numberAndPower[0];
        int power = numberAndPower[1];

        while (inputOfNumbers.contains(bombNumber)){
            int elementIndex = inputOfNumbers.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, inputOfNumbers.size() - 1);


            for (int i = right; i >=left ; i--) {
                inputOfNumbers.remove(i);
            }
        }

        int sum = 0;
        for (int nums : inputOfNumbers) {
            sum += nums;
        }
        System.out.print(sum);
    }
}
