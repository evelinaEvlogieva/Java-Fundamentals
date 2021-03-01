import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    static double powerCalculation(double number, int power){
        double result;
        result = Math.pow(number, power);
//        for (int i = 0; i < power; i++) {
//            result *= number;
//        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.###").format(powerCalculation(number, power)));
    }
}
