import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>([a-zA-z]+)<<(\\d+\\.?\\d+)!(\\d+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> furnitures = new ArrayList<>();

        double sum = 0;

        while (!"Purchase".equals(input)){

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                furnitures.add(matcher.group(1));
                double price = Double.parseDouble(matcher.group(2));
                int count = Integer.parseInt(matcher.group(3));

                sum += price * count;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for (String furniture : furnitures) {
            System.out.println(furniture);
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
