import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split (" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine().split (" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        boolean areEqual = false;
        int diffPlace = 0;
        int sum = 0;

        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] == arr2[i]){
                areEqual = true;
                sum += arr1[i];
            } else {
                diffPlace = i;
                areEqual = false;
                break;
            }

        }

        if (areEqual){
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffPlace);
        }


    }
}
