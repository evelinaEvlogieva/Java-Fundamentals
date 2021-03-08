import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {
                if (isValid(username)){
                    System.out.println(username);
                }
        }

    }

    private static boolean isValid(String username) {
        if (username.length() < 3 || username.length() > 16 ){
            return false;
        }

        for (int i = 0; i < username.length() ; i++) {
            char letter = username.charAt(i);
            if (!Character.isLetterOrDigit(letter) && letter != '-' && letter != '_'){
                return false;
            }

        }
        return true;
    }
}
