import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String string : input) {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt((string.length() - 1));
            long number = Long.parseLong(string.substring(1, string.length() - 1));

            if (Character.isUpperCase(firstLetter)){
                sum += number * 1.0 / (firstLetter - 64);
            } else if (Character.isLowerCase(firstLetter)){
              char letterToUpperCase = Character.toUpperCase(firstLetter);
              sum += number * (letterToUpperCase - 64);

            }

            if (Character.isUpperCase(lastLetter)){
                sum -= lastLetter - 64;
            } else if (Character.isLowerCase(lastLetter)){
                char letterToUpperCase = Character.toUpperCase(lastLetter);
                sum += letterToUpperCase - 64;
            }
        }

        System.out.printf("%.2f", sum);

    }
}
