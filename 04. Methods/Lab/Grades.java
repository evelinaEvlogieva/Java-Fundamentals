import java.util.Scanner;

public class Grades {

    static void printGrades(double grade){
        String text = "";
        if (grade >= 2.00 && grade <= 2.99){
            text = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49){
            text =  "Poor";
        }else if (grade >= 3.50 && grade <= 4.49) {
            text = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            text = "Very good";
        }else if (grade >= 5.50 && grade <= 6.00) {
            text = "Excellent";
        }

        System.out.println(text);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGrades(Double.parseDouble(scanner.nextLine()));

    }
}
