import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!"end".equals(input)) {
            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            if (isStudentExisting(studentsList, firstName, lastName)) {
                Student student = getStudent(studentsList, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);

            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                studentsList.add(student);
            }
            input = scanner.nextLine();

        }

        String townToFilter = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHomeTown().equals(townToFilter)) {

                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

    }

    static boolean isStudentExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    static Student getStudent(List<Student> studentList, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }

        return existingStudent;
    }
}
