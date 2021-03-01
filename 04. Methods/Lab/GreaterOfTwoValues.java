import java.util.Scanner;

public class GreaterOfTwoValues {

    static int getMax (int num1, int num2){
        if (num2 > num1){
            return num2;
        }
        return num1;
    }

    static char getMax (char letter1, char letter2 ){
        if (letter2 > letter1){
            return letter2;
        }
        return letter1;
    }

    static String getMax (String text1, String text2){
        if (text1.compareTo(text2) >= 0){
            return text1;
        }
        return text2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputName = scanner.nextLine();

        if ("int".equals(inputName)){
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1, num2));
        } else if ("char".equals(inputName)){
            char letter1 = scanner.nextLine().charAt(0);
            char letter2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(letter1, letter2));
        } else if ("string".equals(inputName)){
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            System.out.println(getMax(text1, text2));
        }



    }
}
