import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowBallsNumber = Integer.parseInt(scanner.nextLine());
        long snowballValue = 0;
        long maxSnoballValue = Long.MIN_VALUE;

        int maxSnowballSnow = 0;
        int maxSnowballTime= 0;
        int maxSnowballQuality = 0;


        for (int i = 0; i < snowBallsNumber ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = (long)Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue >= maxSnoballValue){
                maxSnoballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %d (%d)",maxSnowballSnow,maxSnowballTime, maxSnoballValue, maxSnowballQuality);
    }
}
