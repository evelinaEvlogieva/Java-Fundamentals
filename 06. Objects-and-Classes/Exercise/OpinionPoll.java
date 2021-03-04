import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<AgeOfPerson> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split(" ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (age > 30) {
                AgeOfPerson ageOfPerson = new AgeOfPerson(name, age);
                people.add(ageOfPerson);
            }
        }

        people.sort((f, s) -> f.getName().compareTo(s.getName()));

        for (AgeOfPerson person : people) {
            System.out.println(person.toString());
        }

    }

    static class AgeOfPerson {
        String name;
        int age;

        public AgeOfPerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }
}
