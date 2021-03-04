import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!"End".equals(input)){

            String [] arrayInput = input.split(" ");
            String name = arrayInput [0];
            String id = arrayInput [1];
            int age = Integer.parseInt(arrayInput[2]);

            Person person = new Person(name, id, age);

            people.add(person);

            input = scanner.nextLine();

        }
        
        people.sort((f ,s) -> f.getAge() - s.getAge());

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
