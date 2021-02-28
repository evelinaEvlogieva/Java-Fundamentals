import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (lines-- > 0){
            int liters = Integer.parseInt(scanner.nextLine());
            sum += liters;
            if (sum > 255){
                System.out.println("Insufficient capacity!");
                sum -=liters;
                continue;
            }
        }


        System.out.println(sum);
    }
}
