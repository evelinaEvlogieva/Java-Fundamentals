import java.util.Scanner;

public class Calculations {

    static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    static void subtract(int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
    }

    static void multiply(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }

    static void divide(int num1, int num2){
        int result = num1 / num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if ("add".equals(command)){
            add(num1,num2);
        } else if ("subtract".equals(command)){
            subtract(num1,num2);
        } else if ("multiply".equals(command)){
           multiply(num1,num2);
        } else if ("divide".equals(command)){
            divide(num1,num2);
        }


    }
}
