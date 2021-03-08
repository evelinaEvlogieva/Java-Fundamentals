import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String wordToReplace = bannedWords [i];
            String asteriksWord = "";
            for (int j = 0; j < wordToReplace.length(); j++) {
                asteriksWord += "*";
            }

            text = text.replace(wordToReplace, asteriksWord);

        }

        System.out.println(text);
    }
}
