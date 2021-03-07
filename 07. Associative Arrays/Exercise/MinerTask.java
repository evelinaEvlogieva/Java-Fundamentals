import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mapOfResources = new LinkedHashMap<>();

        while (!"stop".equals(input)){
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            mapOfResources.putIfAbsent(resource, 0);
            int newValue = mapOfResources.get(resource) + quantity;
            mapOfResources.put(resource, newValue);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : mapOfResources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
