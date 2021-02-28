import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhoustinFactorY = Integer.parseInt(scanner.nextLine());
        int targetCount = 0;

        int initialpower = pokePowerN;

        while (pokePowerN >= distanceM){
            pokePowerN -=distanceM;
            targetCount++;
            if (pokePowerN == initialpower / 2.0 && exhoustinFactorY != 0){
                pokePowerN = pokePowerN / exhoustinFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(targetCount);
    }
}
