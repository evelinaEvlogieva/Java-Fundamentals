import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapOfData = new HashMap<>();


        while (!"Lumpawaroo".equals(input)) {
            String[] data = null;
            if (input.contains("|")) {
                data = input.split("\\| ");
                String side = data[0].trim();
                String user = data[1].trim();

                mapOfData.putIfAbsent(side, new ArrayList<>());
                boolean isPresent = false;
                for (Map.Entry<String, List<String>> entry : mapOfData.entrySet()) {
                    if (entry.getValue().contains(user)){
                        isPresent = true;
                        break;
                    }
                }

                if (!mapOfData.get(side).contains(user) && !isPresent) {
                    mapOfData.get(side).add(user);
                }

            } else {
                data = input.split(" -> ");
                //forceUser -> forceSide
                String user = data[0].trim();
                String side = data[1].trim();

                boolean isPresent = false;
                for (Map.Entry<String, List<String>> entry : mapOfData.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        entry.getValue().remove(user);
                        mapOfData.putIfAbsent(side, new ArrayList<>());
                        mapOfData.get(side).add(user);
                        isPresent = true;
                        break;
                    }
                }

                if (!isPresent) {
                    mapOfData.putIfAbsent(side, new ArrayList<>());

                    if (!mapOfData.get(side).contains(user)) {
                        mapOfData.get(side).add(user);
                    }
                }

                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }

        mapOfData.entrySet().stream().sorted((f, s) -> {
            int result = Integer.compare(s.getValue().size(), f.getValue().size());

            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry -> {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().sort((a, b) -> a.compareTo(b));
                for (String s : entry.getValue()) {
                    System.out.printf("! %s%n", s);
                }
            }
        });


    }
}
