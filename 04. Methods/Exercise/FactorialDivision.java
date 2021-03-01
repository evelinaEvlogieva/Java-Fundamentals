import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(num1) / (calculateFactorial(num2) * 1.0);

        System.out.printf("%.2f", result);
    }

    static long calculateFactorial (int number){
        long factorial = 1;
        for (int i = 2; i <= number ; i++) {
            factorial *= i;

        }
        return factorial;
    }
}
