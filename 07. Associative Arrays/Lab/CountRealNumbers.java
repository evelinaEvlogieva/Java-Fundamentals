import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());


        Map<Double, Integer> counts = new TreeMap<>();

        for (Double number : numbers) {
                counts.putIfAbsent(number, 0);
                counts.put(number,counts.get(number) + 1);
        }


        for (Map.Entry<Double, Integer> nums : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", nums.getKey(), nums.getValue() );
        }



    }
}
