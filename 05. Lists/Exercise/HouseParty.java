import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            String[] firstWordOfInput = input.split(" +");
            String personName = firstWordOfInput[0];

            if (input.contains("is going!")){
                if (!names.contains(personName)){
                    names.add(personName);
                } else {
                    System.out.println(personName + " is already in the list!");
                }


            } else if (input.contains("is not going!")){
                if (!names.contains(personName)){
                    System.out.println(personName + " is not in the list!");
                } else {
                    names.remove(personName);

                }
            }


        }

        for (String goingPeople : names){
            System.out.println(goingPeople);
        }
    }
}
