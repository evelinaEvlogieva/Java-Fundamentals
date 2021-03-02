import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (!first.isEmpty()&&!second.isEmpty()){

            if (first.get(0)>second.get(0)){
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            }else if ((first.get(0))<second.get(0)){
                second.add(second.get(0));
                second.add(first.get(0));
                second.remove(0);
                first.remove(0);
            }else {
                first.remove(0);
                second.remove(0);
            }
        }

        int sum = 0;
        if (first.isEmpty()) {
            for (int i = 0; i < second.size(); i++) {
                sum += second.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < first.size(); i++) {
                sum += first.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }
}
