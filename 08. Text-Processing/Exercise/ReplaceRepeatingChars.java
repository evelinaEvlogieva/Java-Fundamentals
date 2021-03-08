import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char startLetter = input.charAt(0);

        System.out.print(startLetter);

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (startLetter != letter){
                System.out.print(letter);
                startLetter = letter;
            }
        }

    }
}
