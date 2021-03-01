import java.util.Scanner;

public class PrintingTriangle {

    static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printNumberTriangle(int number){
        for (int line = 1; line <= number ; line++) {
            printLine(1, line);
        }

        for (int line = number - 1; line >= 1 ; line--) {
            printLine(1, line);
        }



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printNumberTriangle(Integer.parseInt(scanner.nextLine()));



    }
}
