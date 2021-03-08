import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String countRegex = "[starSTAR]";
        String massageRegex = "@([A-Z][a-z]+)[^@\\-!:>]*?:(\\d+)[^@\\-!:>]*?!([A|D])![^@\\-!:>]*?->(\\d+)";

        Pattern countPattern = Pattern.compile(countRegex);
        Pattern massagePattern = Pattern.compile(massageRegex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher countMatcher = countPattern.matcher(input);

            int count = 0;

            while (countMatcher.find()) {
                count++;

            }

            StringBuilder newMassage = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                char newChar = (char) (input.charAt(j) - count);
                newMassage.append(newChar);

            }

            Matcher massageMatcher = massagePattern.matcher(newMassage);

            while (massageMatcher.find()) {
                if (massageMatcher.group(3).equals("A")) {
                    attackedPlanets.add(massageMatcher.group(1));
                } else if (massageMatcher.group(3).equals("D")) {
                    destroyedPlanets.add(massageMatcher.group(1));

                }

            }

        }


        if (attackedPlanets.size() == 0) {
            System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        } else {
            System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
            Collections.sort(attackedPlanets);
            for (String attackedPlanet : attackedPlanets) {
                System.out.printf("-> %s%n", attackedPlanet);
            }
        }

        if (destroyedPlanets.size() == 0) {
            System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        } else {
            System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
            Collections.sort(destroyedPlanets);
            for (String destroyedPlanet : destroyedPlanets) {
                System.out.printf("-> %s%n", destroyedPlanet);
            }
        }
    }

}
