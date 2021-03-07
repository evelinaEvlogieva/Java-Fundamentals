import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapOfData = new LinkedHashMap<>();
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            mapOfData.putIfAbsent(name, new ArrayList<>());
            mapOfData.get(name).add(grade);

        }

        for (Map.Entry<String, List<Double>> entry : mapOfData.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue)
                    .average().getAsDouble();
            if (average >= 4.50) {
                averageGrades.putIfAbsent(entry.getKey(), average);
            }
        }

      averageGrades.entrySet().stream().sorted((f, s) -> {
         return s.getValue().compareTo(f.getValue());
      }).forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
