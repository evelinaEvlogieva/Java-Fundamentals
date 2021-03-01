import java.util.Scanner;

public class MultiplyEvensByOdds {

    static int getSumOfEvenDigits (int number){
        int evenSum = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            }
        }

        return evenSum;
    }

    static int getSumOfOddDigits (int number){
        int oddSum = 0;
        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;

            if (digit % 2 != 0) {
                oddSum += digit;
            }
        }

        return oddSum;
    }

    static int getMultipleOfEvensAndOdds (int number){
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0){
            number = Math.abs(number);
        }

        System.out.println(getMultipleOfEvensAndOdds(number));

    }
}
