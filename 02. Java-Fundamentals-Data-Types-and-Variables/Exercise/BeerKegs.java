import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        double maxVolume = 0;
        String winnerKeg = "";
        for (int i = 0; i < n ; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * radius * radius * height;
            if (volume > maxVolume){
                maxVolume = volume;
                winnerKeg = name;
            }
        }

        System.out.println(winnerKeg);
    }
}
