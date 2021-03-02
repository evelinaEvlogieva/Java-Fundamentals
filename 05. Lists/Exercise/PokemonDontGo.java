import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;

        while (!distance.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < distance.size()) {
                int valueOfIndex = distance.get(index);
                distance.remove(index);
                sumOfRemovedElements += valueOfIndex;
                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= valueOfIndex) {
                        int newValue = distance.get(i) + valueOfIndex;
                        distance.set(i, newValue);
                    } else {
                        int newValue = distance.get(i) - valueOfIndex;
                        distance.set(i, newValue);
                    }
                }
            } else if (index < 0) {
                int valueOfIndex = distance.get(0);
                distance.set(0, distance.get(distance.size() - 1));
                sumOfRemovedElements += valueOfIndex;
                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= valueOfIndex) {
                        int newValue = distance.get(i) + valueOfIndex;
                        distance.set(i, newValue);
                    } else {
                        int newValue = distance.get(i) - valueOfIndex;
                        distance.set(i, newValue);
                    }
                }

            } else if (index > distance.size() - 1 ){
                int valueOfIndex = distance.get(distance.size() - 1);
                distance.set(distance.size() - 1, distance.get(0));
                sumOfRemovedElements += valueOfIndex;
                for (int i = 0; i < distance.size(); i++) {
                    if (distance.get(i) <= valueOfIndex) {
                        int newValue = distance.get(i) + valueOfIndex;
                        distance.set(i, newValue);
                    } else {
                        int newValue = distance.get(i) - valueOfIndex;
                        distance.set(i, newValue);
                    }
                }
            }
        }

        System.out.println(sumOfRemovedElements);

    }
}
