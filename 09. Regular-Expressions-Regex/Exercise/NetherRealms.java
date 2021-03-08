import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfDemons = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .collect(Collectors.toList());

        Collections.sort(listOfDemons);

        String healthRegex = "([^\\d\\+\\-\\*\\/\\. ])";
        String damageRegex = "(-?\\d+\\.?\\d*)";
        String operationRegex = "[\\*|\\/]";

        Pattern healthPattern = Pattern.compile(healthRegex);
        Pattern damagePattern = Pattern.compile(damageRegex);
        Pattern operationPattern = Pattern.compile(operationRegex);

        for (String demon : listOfDemons) {
            Matcher healthMatcher = healthPattern.matcher(demon);

            int healthSum = 0;

            while (healthMatcher.find()) {
                healthSum += healthMatcher.group().charAt(0);
            }

            Matcher damageMatcher = damagePattern.matcher(demon);

            double damageSum = 0;

            while (damageMatcher.find()){
                damageSum += Double.parseDouble(damageMatcher.group());

            }

            Matcher operationMatcher = operationPattern.matcher(demon);

            while (operationMatcher.find()){
                if (operationMatcher.group().equals("*")){
                    damageSum *= 2;
                } else if (operationMatcher.group().equals("/")){
                    damageSum /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", demon, healthSum, damageSum);
        }

    }
}
