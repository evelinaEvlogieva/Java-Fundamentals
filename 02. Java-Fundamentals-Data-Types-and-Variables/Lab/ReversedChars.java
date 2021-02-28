import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char thirth = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirth, second,first);

    }
}
