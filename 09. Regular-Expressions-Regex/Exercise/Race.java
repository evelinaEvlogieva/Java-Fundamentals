import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] list = scanner.nextLine().split(", ");

        String input = scanner.nextLine();

        String nameRegex = "[A-Za-z]+";
        String distanceRegex = "\\d";

        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern distancePattern = Pattern.compile(distanceRegex);

        Map<String, Integer> mapOfParticipants = new LinkedHashMap<>();


        while (!"end of race".equals(input)) {
            StringBuilder name = new StringBuilder();
            int sum = 0;

            Matcher matcher = namePattern.matcher(input);
            while (matcher.find()) {
                name.append(matcher.group());
            }

            matcher = distancePattern.matcher(input);

            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }

            String participantName = name.toString();

            for (String person : list) {
                if (participantName.equals(person)) {
                    mapOfParticipants.putIfAbsent(participantName, 0);
                    mapOfParticipants.put(participantName, mapOfParticipants.get(participantName) + sum);
                }
            }


            input = scanner.nextLine();
        }

        ArrayList<String> winners = new ArrayList<>();

        List<String> position = new ArrayList<>(Arrays.asList(new String[]{"1st", "2nd", "3rd"}));

        mapOfParticipants.entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> winners.add(e.getKey()));


        for (int i = 0; i < 3 ; i++) {
            System.out.printf("%s place: %s%n", position.get(i), winners.get(i));

        }




    }
}
