import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sumNumbers(num1, num2);
        System.out.println(subtractNumbers(sum, num3));

    }
    static int sumNumbers (int num1, int num2){
        return num1 + num2;
    }

    static int subtractNumbers (int num1, int num2){
        return num1 - num2;
    }
}
