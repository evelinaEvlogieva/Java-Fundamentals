import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            if (isDivisibleBy8(i) && isOddDigit(i)){
                System.out.println(i);
            }

        }

    }

    static boolean isDivisibleBy8(int n) {
        boolean isDivisible = false;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 8 == 0) {
            isDivisible = true;
        }
        return isDivisible;
    }

    static boolean isOddDigit (int n){
        boolean isOddDigit = false;
        int oddDigitCounter = 0;
        String input = n + "";
        for (int i = 0; i < input.length() ; i++) {
           String letter = input.charAt(i) + "";
           int digit = Integer.parseInt(letter);
           if (digit % 2 != 0){
               oddDigitCounter++;
               if (oddDigitCounter == 1){
                   isOddDigit = true;
                   break;
               }
           }

        }
        return isOddDigit;
    }
}