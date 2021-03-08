import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String first = input[0];
        String second = input[1];

        int sum = sumCalculation(first, second);

        System.out.println(sum);
    }

    private static int sumCalculation(String first, String second) {
        int sum = 0;

        for (int i = 0; ( i < first.length() && i < second.length()) ; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        if (first.length() > second.length()){
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }
        return sum;
    }
}
