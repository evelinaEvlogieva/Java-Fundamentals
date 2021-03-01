import java.util.Scanner;

public class ZigZagWithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split( " ");

            if (i % 2 == 0){
                firstArray[i] = input[0];
                secondArray[i] = input[1];
            } else {
                secondArray[i] = input[0];
                firstArray[i] = input[1];
            }
        }

        for (int i = 0; i < firstArray.length ; i++) {
            System.out.print(firstArray[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < secondArray.length ; i++) {
            System.out.print(secondArray[i] + " ");

        }
    }
}

