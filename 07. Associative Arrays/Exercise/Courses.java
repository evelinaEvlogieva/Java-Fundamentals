import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapOfCourses = new LinkedHashMap<>();

        while (!"end".equals(input)) {
            String[] data = input.split(" : ");
            String courseName = data[0];
            String studentsName = data[1];

            mapOfCourses.putIfAbsent(courseName, new ArrayList<>());
            mapOfCourses.get(courseName).add(studentsName);

            input = scanner.nextLine();
        }


        mapOfCourses.entrySet().stream().sorted((f, s) -> {
            return Integer.compare(s.getValue().size(), f.getValue().size());


        }).forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().sort((a, b) -> a.compareTo(b));
            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n", s);
            }
        });
    }
}
