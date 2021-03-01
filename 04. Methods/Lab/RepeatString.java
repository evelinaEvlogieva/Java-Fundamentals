import java.util.Scanner;

public class RepeatString {

    static String repeatString (String inputString, int repeater){
        String newString = "";
        for (int i = 0; i < repeater ; i++) {

            newString += inputString;
        }
        return newString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int repeater = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(inputString, repeater));
    }
}
