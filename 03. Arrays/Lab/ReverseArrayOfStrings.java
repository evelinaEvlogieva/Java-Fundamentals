import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrElements = scanner.nextLine().split(" ");

        String exchange = " ";

        for (int i = 0; i < arrElements.length / 2; i++) {
            exchange = arrElements[i];
            arrElements[i] = arrElements[arrElements.length - 1 - i];
            arrElements[arrElements.length - 1 - i] = exchange;

        }


//        for (int i = 0; i < arrElements.length; i++) {
//            System.out.print(arrElements[i] + " ");
//        }


        for (String elements : arrElements) {
            System.out.print(elements + " ");
        }

    }
}