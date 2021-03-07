import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> mapOfPeople = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            if ("register".equals(command)) {
                String licenceNumber = input[2];
                if (!mapOfPeople.containsKey(name)) {
                    mapOfPeople.put(name, licenceNumber);
                    System.out.printf("%s registered %s successfully%n", name, licenceNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", mapOfPeople.get(name));

                }
            } else if ("unregister".equals(command)) {
                if (!mapOfPeople.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    mapOfPeople.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }

        for (Map.Entry<String, String> entry : mapOfPeople.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
