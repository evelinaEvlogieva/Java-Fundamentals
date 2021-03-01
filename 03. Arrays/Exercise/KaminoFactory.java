import java.util.Scanner;
import java.util.Arrays;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] bestDNA = new int[length];
        int bestSum = 0;
        int bestLength = 0;
        int bestIndex = -1;
        int sampleNum = 0;
        int bestSampleNum = 0;
        while (!input.equals("Clone them!")) {
            int[] numbers = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            sampleNum++;
            int sum = 0;
            int currentLength = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            for (int i = 0; i < numbers.length; i++) {
                currentLength = 0;
                if (numbers[i] == 1) {
                    for (int j = i; j < numbers.length; j++) {
                        if (numbers[j] == 1) {
                            currentLength++;
                        } else {
                            currentLength = 0;
                            break;
                        }
                        if (currentLength > bestLength || currentLength == bestLength && i < bestIndex || currentLength == bestLength && i == bestIndex && sum > bestSum ) {
                            bestLength = currentLength;
                            bestIndex = i;
                            bestSampleNum = sampleNum;
                            bestDNA = numbers;
                            bestSum = sum;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        if (bestSampleNum == 0) {
            bestSampleNum = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestSampleNum, bestSum);
        Arrays.stream(bestDNA).forEach(x -> System.out.print(x + " "));

    }
}
