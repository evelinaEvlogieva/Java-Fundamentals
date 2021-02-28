import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int spiceMinedInDay = 0;
        int sum =0;
        int dayCounter=0;
        boolean isTrue = false;

        while (startingYield >= 100) {
            spiceMinedInDay = startingYield - 26;
            startingYield -= 10;
            sum += spiceMinedInDay;
            dayCounter++;
            isTrue = true;
        }

        sum-= 26;

        if (isTrue) {
            System.out.println(dayCounter);
            System.out.println(sum);

        } else {
            System.out.println(0);
            System.out.println(0);
        }
    }
}
