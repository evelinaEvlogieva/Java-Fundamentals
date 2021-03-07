import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List <String>> mapOfWords = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String keyWord = scanner.nextLine();
            String synonym = scanner.nextLine();

            mapOfWords.putIfAbsent(keyWord, new ArrayList<>());
            mapOfWords.get(keyWord).add(synonym);

        }

        for (Map.Entry<String, List<String>> toPrint : mapOfWords.entrySet()) {
            String listOutput = String.join(", ", toPrint.getValue());
            System.out.printf("%s - %s%n", toPrint.getKey(), listOutput);
        }

    }
}
