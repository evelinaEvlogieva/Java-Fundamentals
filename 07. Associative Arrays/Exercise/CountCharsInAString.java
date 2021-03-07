import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> mapOfLetters = new LinkedHashMap<>();

        for (char letter : input.toCharArray()){
            if (letter != ' '){
                mapOfLetters.putIfAbsent(letter, 0);
                mapOfLetters.put(letter, mapOfLetters.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapOfLetters.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
