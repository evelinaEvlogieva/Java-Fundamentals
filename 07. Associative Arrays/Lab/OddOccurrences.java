import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {
            String newString = input.get(i).toLowerCase();
            input.set(i, newString);
        }

        Map <String, Integer> counts = new LinkedHashMap<>();

        for (String word : input) {
            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);
        }

       List <String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0){
               odds.add(entry.getKey());
            }
        }

        System.out.print(String.join(", ", odds));

    }
}
