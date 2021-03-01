import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrNumbers = Arrays.stream(scanner.nextLine().split (" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number: arrNumbers) {
            if (number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }

        }

        System.out.println(evenSum - oddSum);
    }
}
