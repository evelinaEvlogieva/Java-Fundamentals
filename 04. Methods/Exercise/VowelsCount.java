import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(vowelCounter(input));
    }

    static int vowelCounter (String text){
        String table = "aoeiuAOEIU";
        int vowelCounter = 0;

        for (int i = 0; i < text.length() ; i++) {
            char letter = text.charAt(i);
            if (table.contains(letter + "")){
                vowelCounter++;

            }

        }
        return vowelCounter;
    }
}
