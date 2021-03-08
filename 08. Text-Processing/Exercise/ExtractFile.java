import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String nameAndExtension = input.substring(input.lastIndexOf("\\") + 1);

        String name = nameAndExtension.substring(0, nameAndExtension.lastIndexOf("."));

        String extension = nameAndExtension.substring(nameAndExtension.lastIndexOf(".") + 1);

        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s", extension);
    }
}
