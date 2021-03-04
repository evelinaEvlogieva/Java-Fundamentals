import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            //ламбда израза не приема double, за това превръщам оценките в цели числа!!!
            //grade = grade * 100;

            Student student = new Student(firstName, lastName, grade);

            studentsList.add(student);
        }
        //studentsList.sort((f, s) -> (int) s.getGrade() - (int)f.getGrade());
        studentsList.sort((f, s) -> Double.compare(s.getGrade(),f.getGrade()));




        for (Student student : studentsList) {
            System.out.println(student.toString());
        }

    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
