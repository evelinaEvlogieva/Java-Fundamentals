import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int firstMin = smallestNumberFinder(num1, num2);
        int minNum = smallestNumberFinder(firstMin, num3);

        System.out.println(minNum);

    }

    static int smallestNumberFinder (int num1, int num2){
        int minNum = num1;
        if (num1 > num2){
            minNum = num2;
        }
        return minNum;
    }
}
