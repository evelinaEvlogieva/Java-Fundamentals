import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);

        printCharsInRange(one, two);


    }

    static void printCharsInRange(char one, char two) {
        if (one > two) {
            for (char i = two; i < one - 1; i++) {
                System.out.print((char) (i + 1) + " ");
            }
        } else {
            for (char i = one; i < two - 1; i++) {
                System.out.print((char) (i + 1) + " ");

            }
        }
    }
}
