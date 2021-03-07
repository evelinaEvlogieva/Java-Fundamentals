import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> people = new HashMap<>();
        Map <String, Integer> courses = new HashMap<>();




        while (!"exam finished".equals(input)) {
            String[] data = input.split("-");
            String name = data[0];
            String language = data[1];
            if (!language.equals("banned")) {
                int points = Integer.parseInt(data[2]);
                if(!people.containsKey(name)){
                    people.put(name, points);
                } else {
                    if (people.get(name) < points){
                        people.put(name, points);
                    }
                }

                courses.putIfAbsent(language, 0);
                courses.put(language, courses.get(language) + 1);


            } else {
                people.remove(name);

            }


            input = scanner.nextLine();
        }

        System.out.println("Results:");

        people.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().compareTo(f.getValue());

            if (result == 0){
              result =  f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");

        courses.entrySet().stream().sorted((f,s) -> {
            int result = s.getValue().compareTo(f.getValue());

            if (result == 0){
                result =  f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));
    }
}
