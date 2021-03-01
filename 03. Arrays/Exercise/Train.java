import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());

        int[] peopleInWagon = new int[wagonCount];

        int sum = 0;
        for (int i = 0; i < peopleInWagon.length ; i++) {
            peopleInWagon[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleInWagon[i];
        }

        for (int people : peopleInWagon){
            System.out.print(people + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
