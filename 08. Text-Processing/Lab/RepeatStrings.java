import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                output.append(input[i]);

            }
        }
        System.out.println(output.toString());

//        По сторомодния начин, без StringBuilder:
//        List <String> output = new ArrayList<>();
//        for (int i = 0; i < input.length ; i++) {
//            String repeatedWord = "";
//            for (int j = 0; j < input[i].length() ; j++) {
//                repeatedWord += input[i];
//            }
//            output.add(repeatedWord);
//        }
//        System.out.println(String.join("", output));

    }
}
