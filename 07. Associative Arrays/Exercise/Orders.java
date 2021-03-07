import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> mapPrice = new LinkedHashMap<>();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();
        Map<String, Double> mapTotal = new LinkedHashMap<>();


        while (!"buy".equals(input)){
            String[] lineOfProduct = input.split(" ");
            String name = lineOfProduct[0];
            double price = Double.parseDouble(lineOfProduct[1]);
            int quantity = Integer.parseInt(lineOfProduct[2]);



            if (!mapPrice.containsKey(name) && !mapQuantity.containsKey(name)){
                mapPrice.put(name, price);
                mapQuantity.put(name, quantity);
            } else {
                //увеличавам quantity; сменям price
                mapPrice.put(name, price);
                mapQuantity.put(name, mapQuantity.get(name) + quantity);
            }

            double totalPrice = mapPrice.get(name) * mapQuantity.get(name);
            mapTotal.put(name, totalPrice);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : mapTotal.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());

        }

    }
}
