import java.sql.SQLOutput;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = doMathOperation(num1, operator, num2);
        System.out.printf("%.0f", result);



    }

    static double doMathOperation (int num1, String operation, int num2){
        double result = 0;
        if ("+".equals(operation)){
            result = num1 + num2;
        } else if ("-".equals(operation)){
            result = num1 - num2;
        } else if ("*".equals(operation)){
            result = num1 * num2;
        } else if ("/".equals(operation)){
            result = num1 / (num2 * 1.0);
        }
        return result;
    }
}
