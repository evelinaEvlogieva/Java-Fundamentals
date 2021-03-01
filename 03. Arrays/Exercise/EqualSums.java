import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int[] numbers = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        String output = "no";

        for (int i = 0; i < numbers.length ; i++) {
            int lefSum = 0;
            int rigthSum = 0;
            for (int left = 0; left < i ; left++) {
                lefSum += numbers[left];
            }
            for (int rigt = i + 1; rigt < numbers.length ; rigt++) {
                rigthSum += numbers[rigt];

            }
            if (lefSum == rigthSum){
                output = i + "";
                break;
            }
        }

        System.out.println(output);
    }
}
