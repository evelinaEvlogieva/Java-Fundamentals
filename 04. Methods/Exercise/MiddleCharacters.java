import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(middleChar(input));

    }

    static String middleChar (String text) {
        int position;
        int length;
        if (text.length() % 2 == 0) {
            position = text.length() / 2 - 1;
            length = 2;
        } else {
            position = text.length() / 2;
            length = 1;
        }
        return text.substring(position, position + length);
    }
}
