import java.util.Scanner;

public class CalculateRectangleArea {

    static double RectangleAreaCalculation(double width, double length){
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double with = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = RectangleAreaCalculation(with,length);

        System.out.printf("%.0f",area);
    }
}
