import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = people/ capacity;

        //int courses = (int) Math.ceil((double) people / capacity);

        if (people % capacity != 0){
            courses++;
        }

        System.out.println(courses);
    }
}
