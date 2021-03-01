import java.util.Scanner;

public class Orders {

    static void priceCalculation(int quantity, double price){
        double totalSum = quantity * price;
        System.out.printf("%.2f", totalSum);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (product){
            case "coffee":
                price = 1.50;
                priceCalculation(quantity, price);
                break;
            case "water":
                price = 1.00;
                priceCalculation(quantity, price);
                break;
            case "coke":
                price = 1.40;
                priceCalculation(quantity, price);
                break;
            case "snacks":
                price = 2.00;
                priceCalculation(quantity, price);
                break;
        }

    }
}
