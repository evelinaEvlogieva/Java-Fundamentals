import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (validatePassword(password)) {
            System.out.println("Password is valid");
        }
    }

    static boolean validatePassword(String password) {
        boolean isValid = true;
        if (!isBetween6and10chars(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!consistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        return isValid;
    }

    static boolean isBetween6and10chars(String password) {
        boolean isValid = false;
        if (password.length() >= 6 && password.length() <= 10) {
            isValid = true;
        }
        return isValid;
    }

    static boolean consistOnlyLettersAndDigits(String password) {
        boolean isValid = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    static boolean hasAtLeastTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
                if (counter == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
